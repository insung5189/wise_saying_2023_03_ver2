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
            if (command.equals("등록")) {
                System.out.printf("명언 입력 : ");
                String wiseSaying = sc.nextLine().trim();
                System.out.printf("작가 입력 : ");
                String wiseSaying2 = sc.nextLine().trim();
            }
            if (command.equals("종료")) {
                break;
            }
        }

        // 받은 글자 "종료"일 때 프로그램 종료

    }
}
/* level-2
명령 : 등록
명언 :
작가 :
명령 :
* */