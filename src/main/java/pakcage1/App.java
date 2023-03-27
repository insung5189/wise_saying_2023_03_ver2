package pakcage1;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("==명언 앱==");
        while (true) {
            System.out.printf("명령 입력 : ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            }
        }

        // 받은 글자 "종료"일 때 프로그램 종료

    }
}
