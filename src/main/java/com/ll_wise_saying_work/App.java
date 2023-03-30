package com.ll_wise_saying_work;

import com.ll_wise_saying_work.system.controller.SystemController;
import com.ll_wise_saying_work.wiseSaying.controller.WiseSayingController;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        ArrayList<WiseSayingControl> sayings = new ArrayList<>();

        System.out.println("==명언 앱==");
        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        int wiseSayingNum = 0;
        while (true) {
            System.out.printf("명령(등록, 목록, 종료) : ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                systemController.exit();

                break;
            } else if (command.equals("등록")) {
                systemController.write();
                System.out.printf("명언 : ");
                String wiseSaying = sc.nextLine().trim();
                System.out.printf("작가 : ");
                String wiseSayingAuthor = sc.nextLine().trim();

                int id = wiseSayingNum + 1;

                String content = wiseSaying;
                String authorName = wiseSayingAuthor;

                WiseSayingControl wiseSayingControl = new WiseSayingControl(id, content, authorName);

                sayings.add(wiseSayingControl);

                System.out.println(wiseSayingNum + "번 명언이 등록되었습니다.");

                wiseSayingNum++; // 증가

            } else if (command.equals("목록")) {
                wiseSayingController.목록();
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(30));

                for (int i = 0; i < sayings.size(); i++) {
                    WiseSayingControl wiseSayingControl = sayings.get(i);
                    System.out.printf("%d / %s / %s \n", wiseSayingControl.getId(), wiseSayingControl.getAuthorName(), wiseSayingControl.getContent());
                }

                System.out.printf("총 명언 수 : " + sayings.size() + "\n");
//                String wiseSaying = sc.nextLine().trim();
            } else {
                System.out.println("명령을 똑바로 입력하쎄용.");
            }
        }
    }
}
/*
class WiseSaying {
    private long id;
    private String content;
    private String authorName;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }
}
 */


/* level-2
명령 : 등록
명언 :
작가 :
명령 :
* */

/* level-3
명령 : 등록
명언 : 명언1
작가 : 작가1
1번 명언이 등록되었습니다.
명령 : 종료
* */

/* level-4
명령 : 등록
명언 : 명언1
작가 : 작가1
1번 명언이 등록되었습니다.
명령 : 등록
명언 : 명언1
작가 : 작가1
2번 명언이 등록되었습니다.
* */

/* level-5
== 명언 앱 ==
명령) 등록
명언 : 현재를 사랑하라.
작가 : 작자미상
1번 명언이 등록되었습니다.
명령) 등록
명언 : 현재를 사랑하라.
작가 : 작자미상
2번 명언이 등록되었습니다.
명령) 목록
번호 / 작가 / 명언
----------------------
2 / 작자미상 / 과거에 집착하지 마라.
1 / 작자미상 / 현재를 사랑하라.
명령) 종료

String array[] = new array[];

명언번호 배열 sayingNumArr[]
명언작가 배열 sayingAuthorArr[]
명언내용 배열 wiseSayingArr[]
for
System.out.println(sayingNumArr[] + "/" + sayingAuthorArr[] + "/" + wiseSayingArr[]);


* */