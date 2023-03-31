package com.ll_wise_saying_work.wiseSaying.controller;
// 명언 앱 >> 세부로직 영역

import com.ll_wise_saying_work.Container;
import com.ll_wise_saying_work.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.Scanner;

public class WiseSayingController {

    ArrayList<WiseSaying> sayings = new ArrayList<>(); // sayings라는 변수에 ArrayList를 적용하여 가변적으로 데이터 입력이 가능한 배열 생성.
    // sayings = 데이터를 입력할때마다 데이터 양에 따라서 인덱스도 자동으로 늘어나는 배열(ArrayList를 사용했기때문.)
    int wiseSayingNum = 1; // 명언 갯수를 카운트하기위해 초기화된 변수. (아래 조건문 안에서 조건에 만족하면 증가시켜줄거임.)

    public void 등록() {

        System.out.printf("명언 : "); // '명언 : '안내문
        String wiseSay = Container.getScanner().nextLine().trim(); // 문자열타입 wiseSaying변수에 한 줄을 입력받는 sc변수를 넣어주고 trim()으로 공백을 알아서 제거해줌.
        System.out.printf("작가 : "); // '작가 : '안내문
        String wiseSayingAuthor = Container.getScanner().nextLine().trim(); // 문자열타입 wiseSayingAuthor변수에 한 줄을 입력받는 sc변수를 넣어주고 trim()으로 공백을 알아서 제거해줌.

        // 아래 3개의 변수 id, content, authorName은 명언 리스트업을 위해 선언된 변수들.
        int id = wiseSayingNum; // 정수형타입 id변수에 명언 갯수를 카운트하기위해 선언한 변수 wiseSayingNum을 넣어줌.
        String content = wiseSay; // 문자열타입 content변수에 스캐너로 입력받은 명언이 담긴 wiseSaying을 넣어줌.
        String authorName = wiseSayingAuthor; // 문자열타입 authorName변수에 스캐너로 입력받은 명언이 담긴 wiseSayingAuthor을 넣어줌.

        WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
        // 위에서 선언 및 초기화된 id, content, authorName변수들을 매개변수로 받는 WiseSaying클래스 인스턴스화

        sayings.add(wiseSaying); // ArrayList로 만들어준 가변적 배열 sayings에 배열값으로 객체화된 wiseSaying을 넣어줌.

        System.out.println(wiseSayingNum + "번 명언이 등록되었습니다."); // 카운팅된 명언 안내문.

        wiseSayingNum++; // 카운팅 넘버 증가
    }

    public void 목록() {
        System.out.println("번호 / 작가 / 명언"); // 리스트 상위에 있는 목록 구분 안내문.
        System.out.println("-".repeat(30)); // 텍스트상 구분과 내용을 경계짓는 ---텍스트
        // repeat(반복할 숫자입력);을 사용해서 일일이 출력문을 입력하지 않고 같은 내용을 반복할 수 있다.

        for (int i = 0; i < sayings.size(); i++) {
            // 번호, 명언, 작가 값이 입력된 sayings배열을 배열의 길이만큼(sayings.size())순회하면서 각 데이터를 나열하도록 함.
            WiseSaying wiseSaying = sayings.get(i);
            // 클래스형 변수 wiseSaying에 sayings 배열의 값들을 get으로 가져오면서 그 인덱스값으로 i값을 넣어 증가하도록한 뒤
            System.out.printf("%d / %s / %s \n", wiseSaying.getId(), wiseSaying.getAuthorName(), wiseSaying.getContent());
            // WiseSaying 클래스에서 지정해놓은 메서드를 위 출력문에서 호출하여 같이 출력함.
        }

        System.out.printf("총 명언 수 : " + sayings.size() + "\n"); // sayings.size();를 이용해서 배열의 길이를 불러오고 총 명언수로 표시함.
//                String wiseSaying = sc.nextLine().trim();

    }
    public void 삭제 (Rq rq) {

    }


}
