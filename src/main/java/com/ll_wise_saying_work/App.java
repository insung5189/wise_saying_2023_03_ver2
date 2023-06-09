package com.ll_wise_saying_work;
// 명언 앱

import com.ll_wise_saying_work.system.controller.SystemController;
import com.ll_wise_saying_work.wiseSaying.controller.WiseSayingController;

import java.util.ArrayList; // ArrayList불러옴
import java.util.HashMap;
import java.util.Scanner; // Scanner 불러옴

public class App {

    public void run() { // Main클래스 9번째 줄에서 실행할 run(); 메서드

        System.out.println("==명언 앱=="); // ==명언 앱== 안내문.
        SystemController systemController = new SystemController(); // 리팩토링을 위한 SystemController 인스턴스화
        WiseSayingController wiseSayingController = new WiseSayingController(); // 리팩토링을 위한 WiseSayingController 인스턴스화


        while (true) { // 프로그램 실행상 명령에 맞게 진행해야 하는데,
            // 여기서는 "등록"기능과 "목록"기능을 프로그램 실행중에 반복적으로 몇 번이고 불러올 수 있도록 하기 위해 while 문을 사용함.
            System.out.printf("명령(등록, 목록, 종료, 삭제, 수정) : "); // 명령을 위한 안내문.
            String command = Container.getScanner().nextLine().trim(); // 문자열타입 command 변수에 한 줄을 입력받는 sc 변수를 넣어주고 trim()으로 공백을 알아서 제거해줌.
            // Container.getScanner()를 사용해서 sc 대신 바로 연결해준다.
            Rq rq = new Rq(command); // 스캐너로 입력받은 값 command가 매개변수 값으로 작용해서 Rq 생성자의 매개변수로 접근함.
            // request의 약자로 Rq라는 클래스를 생성해서 명령값을 command라는 변수로 받는다. 해당 매개변수는 Rq의 생성자 내부에서 매개변수로 받아서 처리된다.

            switch(rq.getActionCode()) { // Rq클래스에 있는 String actionCode를 담고있는 메서드를 매개변수값으로 호출하는데,
                // 결국 actionCode = commandBits[0] 이기 때문에 switch문이 받는 매개변수값은 commandBits[0]의 값이다.(자세한 내용은 Rq생성자 내부로직 참고)
                // switch문을 이용해서 명령을 구분하여 해당 케이스별로 로직을 실행하도록 함.
                case "종료":
                    systemController.종료(); // SystemController 클래스에 있는 종료 메서드 호출
                    return; // switch문에선 break;가 아닌 return;으로 탈출한다
                case "등록":
                    wiseSayingController.등록(); // WiseSayingController 클래스에 있는 등록 메서드 호출
                    break;
                case "목록":
                    wiseSayingController.목록(); // WiseSayingController 클래스에 있는 목록 메서드 호출
                    break;
                case "삭제":
                    wiseSayingController.삭제(rq); // WiseSayingController 클래스에 있는 삭제 메서드를 rq생성자 매개변수를 받아 호출
                    break;
                case "수정":
                    wiseSayingController.수정(rq); // WiseSayingController 클래스에 있는 수정 메서드를 rq생성자 매개변수를 받아 호출
                    break;
                default: // 아무 단어도 매칭되지 않으면
                    System.out.println(">>명령을 똑바로 입력하쎄용.\n"); // 명령을 똑바로 입력하라는 출력문
            }
/*
            if (command.equals("종료")) {
                // 콘솔 입력창에 '종료'를 입력하면 command변수로 값이 들어감.
                // if문의 조건을 command의 데이터값이 '종료'일 때이기 때문에 그 조건에 부합하면 아래에 있는 break가 실행됨.(equals는 해당변수의 값을 비교.)
                System.out.println(">>명령을 똑바로 입력하쎄용.\n");
                break;

            } else if (command.equals("등록")) {
                // "종료"케이스와 마찬가지로 콘솔입력창에 '등록'이라고 입력하면 command값이 '등록'이 되고
                // 조건에 일치하면 아래 코드를 수행.

            } else if (command.equals("목록")) {
                // "종료"케이스와 마찬가지로 콘솔입력창에 '목록'이라고 입력하면 command값이 '목록'이 되고
                // 조건에 일치하면 아래 코드를 수행.
                // 리팩토링을 위한 메서드 호출문.

            } else if (command.startsWith("삭제")) { // 문자열안에 startWith('단어')가 있으면 해당 로직을 실행해라.
                // 우리는 물음표 기준으로 나눌 것.
//                rq = new Rq(command);
//                rq.getActionCode();
//                rq.getParams("id");


            } else if (command.equals("수정")) {
                wiseSayingController.수정(rq);

            }


 */
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


*/