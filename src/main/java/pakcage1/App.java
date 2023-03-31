package pakcage1;

import pakcage1.system.controller.SystemController;
import pakcage1.wiseSaying.controller.WiseSayingController;
import pakcage1.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("==명언 앱=="); // 안내문
        System.out.println("1. register");
        System.out.println("2. list");
        System.out.println("3. terminate");


        SystemController systemController = new SystemController();

        WiseSayingController wiseSayingController = new WiseSayingController(sc);

        while (true) {
            System.out.println("=".repeat(27));

            System.out.printf("Command: ");
            String command = this.sc.nextLine().trim().toLowerCase();

            if (command.equals("terminate")) {
                systemController.terminate();
                break;
            } else if (command.equals("register")) {
                wiseSayingController.register();

            } else if (command.equals("list")) {
                wiseSayingController.list();

            } else if (command.equals("help")) {
                systemController.help();

            } else {
                systemController.errorInput();

            }
        }


        // 받은 글자 "종료"일 때 프로그램 종료

    }
}
