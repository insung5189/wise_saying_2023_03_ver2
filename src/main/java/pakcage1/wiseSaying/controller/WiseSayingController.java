package pakcage1.wiseSaying.controller;

import pakcage1.Container;
import pakcage1.wiseSaying.controller.entity.WiseSaying;

import java.util.ArrayList;

public class WiseSayingController {
    int lastWiseSayingId = 0;
    WiseSaying wiseSaying;
    ArrayList<WiseSaying> wiseSayingArr = new ArrayList<>(); // wiseSayingArr에 ArrayList 기능을 할당해줌.
    public void 등록() {
        int id = lastWiseSayingId + 1;

        System.out.printf("명언을 입력하세요 : "); // 명언 입력 안내문
        String wiseSay = Container.getScanner().nextLine().trim(); // 명언의 입력을 받은 문자열을 wiseSay에 저장.
        System.out.printf("작가를 입력하세요 : "); // 작가 입력 안내문
        String authorName = Container.getScanner().nextLine().trim(); // 작가의 입력을 받은 문자열을 authorName에 저장.

        wiseSaying = new WiseSaying(id, wiseSay, authorName);
        wiseSayingArr.add(wiseSaying);

        System.out.printf("%d번 명언이 등록되었습니다.\n", id);
        lastWiseSayingId = id;
    }

    public void 목록() {
        System.out.println("번호 / 명언 / 작가");
        System.out.println("=".repeat(30));

        for (int i = 0; i < wiseSayingArr.size(); i++) {
            wiseSaying = wiseSayingArr.get(i);
            System.out.printf("%d , %s , %s\n", wiseSaying.getId(), wiseSaying.getContent(), wiseSaying.getAuthor());
        }
        System.out.printf("총 명언 수 : %d\n", wiseSayingArr.size());
    }
}
