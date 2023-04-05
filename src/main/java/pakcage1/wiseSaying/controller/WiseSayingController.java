package pakcage1.wiseSaying.controller;

import pakcage1.Container;
import pakcage1.Rq;
import pakcage1.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;

public class WiseSayingController {
    int id = 1; // int 형으로 id라는 변수를 1로 초기화 명언의 넘버링을 위해 선언된 변수


    ArrayList<WiseSaying> arrlist = new ArrayList<>();
    // ArrayList에 WiseSaying 을 타입으로 지정해서 arrlist는 WiseSaying클래스에 있는 정보를 담을 수 있는 (가변적)배열이 됐다.

    public void 등록() { // 등록 기능을 담고있는 메서드(App클래스의 if else문 안에서 호출됨.)
        System.out.printf("명언을 입력하세요 : "); // 명언을 입력하라는 안내문
        String wiseSay = Container.getScanner().nextLine().trim(); // 스캐너로 한 줄로 공백까지 제거해서 입력받은 값이
        // 문자열 자료형 wiseSay 변수에 들어간다.
        System.out.printf("작가를 입력하세요 : "); // 작가를 입력하라는 안내문
        String author = Container.getScanner().nextLine().trim(); // 스캐너로 한 줄로 공백까지 제거해서 입력받은 값이
        // 문자열 자료형 author에 들어간다.
        arrlist.add(new WiseSaying(id, author, wiseSay));

        System.out.printf("%d번 명언이 등록되었습니다.\n", id); // 위에서 선언한 id값이 출력문에 들어가서 등록되었다고 안내문 출력
        id++; // id가 1씩 증가한다. 왜? : 명언이 추가될수록 값이 올라가야 누적된 값이 표시되기 때문에
    }

    public void 목록() { // 목록 기능을 담고있는 메서드(App클래스의 if else문 안에서 호출됨.)
        System.out.printf("총 명언 수 : %d\n", arrlist.size());
        System.out.println("번호 / 작가 / 명언"); // 번호 / 작가 / 명언 안내문
        System.out.println("=".repeat(30)); // 구획선 안내문(.repeat를 사용해서 해당 문자열을 몇 번 반복해줄지 지정 가능.)
        for (int i = arrlist.size() - 1; i >= 0 ; i--) { // i 안에 배열의 길이값-1만큼 할당하고 i를 0 이하로 떨어지지 않게 감소시킨다.
            WiseSaying wiseSaying = arrlist.get(i); // 그리고 i값을 해당 배열의 인덱스값으로 지정하면 인덱스값이 바뀔때마다 해당 배열의 값을 끝에부터 하나씩 불러올 수 있다.
            System.out.printf("%d / %s / %s\n", wiseSaying.getId(), wiseSaying.getAuthorName(), wiseSaying.getWiseSaying());
            // 해당 배열의 번호 / 작가 / 명언 내용을 각각 담고있는 get메서드를 인스턴스화 한 클래스(WiseSaying)를 통해서 불러온다.
        }
    }

    public void 삭제(Rq rq) {
        int id = -1;
        try {
            id = Integer.parseInt(rq.getParams("id")); // getParams를 통한 id값을 숫자로 받아야 하기 때문에 .parseInt로 형변환 진행
        } catch (NumberFormatException e) {
            System.out.println("정수를 입력해 주세요");
        }
        System.out.printf("%d번 명언이 삭제되었습니다.\n", id);
    }

    public static void remove() {

    }
}
