package pakcage1;

import pakcage1.system.controller.SystemController;
import pakcage1.wiseSaying.controller.WiseSayingController;
import pakcage1.wiseSaying.controller.entity.WiseSaying;

import java.util.ArrayList;
import java.util.Scanner;

public class App { // 세부로직을 실행하기 위한 App 클래스



    public void run() { // Main 클래스에서 호출될 run메서드


        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        while (true) { // 종료 라는 키워드를 입력하기 전까지 프로그램이 끝나게 하지 않기 위해서 while문으로 무한반복을 걸어줌.
            System.out.println("=== 명언 앱 ==="); // 명언 앱 안내문
            System.out.println("=".repeat(30)); // 구획선
            System.out.println("1. 종료"); // 명령 안내
            System.out.println("2. 등록"); // 명령 안내
            System.out.println("3. 목록"); // 명령 안내
            System.out.println("4. 삭제"); // 명령 안내
            System.out.println("=".repeat(30)); // 구획선

            System.out.printf("명령 : "); // 명령 안내
            String command = Container.getScanner().nextLine().trim(); // '명령 : ' 의 입력을 받은 문자열을 command에 저장.

            if (command.equals("종료")) { // 입력받은 문자열이 '종료'와 일치하면 아래 로직을 실행시켜라
                systemController.종료();
                break; // 종료를 실행시 실질적인 기능 -> while문을 탈출하면서 로직을 종료시킴

            } else if (command.equals("등록")) { // 입력받은 문자열이 '등록'과 일치하면 아래 로직을 실행시켜라
                wiseSayingController.등록();


            } else if (command.equals("목록")) {
                wiseSayingController.목록();

            } else {
                systemController.명령불일치();

            }
        }
    }
}
