package com.ll_wise_saying_work;

import com.ll_wise_saying_work.system.controller.SystemController;
import com.ll_wise_saying_work.wiseSaying.controller.WiseSayingController;

import java.util.ArrayList; // ArrayList불러옴
import java.util.Scanner; // Scanner 불러옴

public class App {
    private final Scanner sc; // App 클래스에 스캐너타입 변수 sc 새로 선언해줌.

    public App(Scanner sc) { // Main클래스에서 변수 sc를 받아오기 위해 App생성자 매개변수란에 Scanner타입 변수 sc 넣어줌.
        this.sc = sc; // Main클래스에서 받아온 변수 sc를 현재 class에 인스턴스 변수로 선언된 sc(this.sc)에 넣어줌.
    }

    public void run() { // Main클래스 9번째 줄에서 실행할 run(); 메서드
        ArrayList<WiseSayingControl> sayings = new ArrayList<>(); // sayings라는 변수에 ArrayList를 적용하여 가변적으로 데이터 입력이 가능한 배열 생성.
        // sayings = 데이터를 입력할때마다 데이터 양에 따라서 인덱스도 자동으로 늘어나는 배열(ArrayList를 사용했기때문.)

        System.out.println("==명언 앱=="); // ==명언 앱== 안내문.
//        SystemController systemController = new SystemController(); // 리팩토링을 위한 Systemcontroller 인스턴스화
//        WiseSayingController wiseSayingController = new WiseSayingController(); // 리팩토링을 위한 WiseSayingController 인스턴스화

        int wiseSayingNum = 1; // 명언 갯수를 카운트하기위해 초기화된 변수. (아래 조건문 안에서 조건에 만족하면 증가시켜줄거임.)

        while (true) { // 프로그램 실행상 명령에 맞게 진행해야 하는데,
            // 여기서는 "등록"기능과 "목록"기능을 프로그램 실행중에 반복적으로 몇 번이고 불러올 수 있도록 하기 위해 while문을 사용함.
            System.out.printf("명령(등록, 목록, 종료) : "); // 명령을 위한 안내문.
            String command = sc.nextLine().trim(); // 문자열타입 command변수에 한 줄을 입력받는 sc변수를 넣어주고 trim()으로 공백을 알아서 제거해줌.
            if (command.equals("종료")) {
                // 콘솔 입력창에 '종료'를 입력하면 command변수로 값이 들어감.
                // if문의 조건을 command의 데이터값이 '종료'일 때이기 때문에 그 조건에 부합하면 아래에 있는 break가 실행됨.(equals는 해당변수의 값을 비교.)
//                systemController.종료();
                break; // 조건이 만족하면 break;가 실행되고 while문에서 빠져나옴.
            } else if (command.equals("등록")) {
                // "종료"케이스와 마찬가지로 콘솔입력창에 '등록'이라고 입력하면 command값이 '등록'이 되고
                // 조건에 일치하면 아래 코드를 수행.
//                wiseSayingController.등록();
                System.out.printf("명언 : "); // '명언 : '안내문
                String wiseSaying = sc.nextLine().trim(); // 문자열타입 wiseSaying변수에 한 줄을 입력받는 sc변수를 넣어주고 trim()으로 공백을 알아서 제거해줌.
                System.out.printf("작가 : "); // '작가 : '안내문
                String wiseSayingAuthor = sc.nextLine().trim(); // 문자열타입 wiseSayingAuthor변수에 한 줄을 입력받는 sc변수를 넣어주고 trim()으로 공백을 알아서 제거해줌.

                // 아래 3개의 변수 id, content, authorName은 명언 리스트업을 위해 선언된 변수들.
                int id = wiseSayingNum; // 정수형타입 id변수에 명언 갯수를 카운트하기위해 선언한 변수 wiseSayingNum을 넣어줌.
                String content = wiseSaying; // 문자열타입 content변수에 스캐너로 입력받은 명언이 담긴 wiseSaying을 넣어줌.
                String authorName = wiseSayingAuthor; // 문자열타입 authorName변수에 스캐너로 입력받은 명언이 담긴 wiseSayingAuthor을 넣어줌.

                WiseSayingControl wiseSayingControl = new WiseSayingControl(id, content, authorName);
                // 위에서 선언 및 초기화된 id, content, authorName변수들을 매개변수로 받는 WiseSayingControl클래스 인스턴스화

                sayings.add(wiseSayingControl); // ArrayList로 만들어준 가변적 배열 sayings에 배열값으로 객체화된 wiseSayingControl을 넣어줌.

                System.out.println(wiseSayingNum + "번 명언이 등록되었습니다."); // 카운팅된 명언 안내문.

                wiseSayingNum++; // 카운팅 넘버 증가

            } else if (command.equals("목록")) {
                // "종료"케이스와 마찬가지로 콘솔입력창에 '목록'이라고 입력하면 command값이 '목록'이 되고
                // 조건에 일치하면 아래 코드를 수행.
//                wiseSayingController.목록(); // 리팩토링을 위한 메서드 호출문.
                System.out.println("번호 / 작가 / 명언"); // 리스트 상위에 있는 목록 구분 안내문.
                System.out.println("-".repeat(30)); // 텍스트상 구분과 내용을 경계짓는 ---텍스트
                // repeat(반복할 숫자입력);을 사용해서 일일이 출력문을 입력하지 않고 같은 내용을 반복할 수 있다.

                for (int i = 0; i < sayings.size(); i++) {
                    // 번호, 명언, 작가 값이 입력된 sayings배열을 배열의 길이만큼(sayings.size())순회하면서 각 데이터를 나열하도록 함.
                    WiseSayingControl wiseSayingControl = sayings.get(i);
                    // 클래스형 변수 wiseSayingControl에 sayings 배열의 값들을 get으로 가져오면서 그 인덱스값으로 i값을 넣어 증가하도록한 뒤
                    System.out.printf("%d / %s / %s \n", wiseSayingControl.getId(), wiseSayingControl.getAuthorName(), wiseSayingControl.getContent());
                    // WiseSayingControl 클래스에서 지정해놓은 메서드를 위 출력문에서 호출하여 같이 출력함.
                }

                System.out.printf("총 명언 수 : " + sayings.size() + "\n"); // sayings.size();를 이용해서 배열의 길이를 불러오고 총 명언수로 표시함.
//                String wiseSaying = sc.nextLine().trim();
            } else {
                System.out.println(">>명령을 똑바로 입력하쎄용.\n");
                // if문에서 어떤 조건도 만족하지 못할경우 최종적으로 else로 와서 명령을 똑바로 입력하라고 출력.
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


*/