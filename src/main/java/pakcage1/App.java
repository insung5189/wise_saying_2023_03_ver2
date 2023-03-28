package pakcage1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("==명언 앱==");
        int wiseSayingNum = 1;
        while (true) {
            System.out.printf("명령) : ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.printf("명언 : ");
                String wiseSaying = sc.nextLine().trim();
                System.out.printf("작가 : ");
                String wiseSayingAuthor = sc.nextLine().trim();
                System.out.println(wiseSayingNum + "번 명언이 등록되었습니다.");
                wiseSayingNum++;
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
