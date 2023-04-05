package pakcage1;

import pakcage1.system.controller.SystemController;
import pakcage1.wiseSaying.controller.WiseSayingController;

public class App {
    public static void run() { // run메서드 실행 세부로직을 실행하는 메서드
        SystemController systemController = new SystemController(); // 각 객체에 할당된 기능(종료기능) 메서드를 호출하기 위한 클래스 인스턴스화
        WiseSayingController wiseSayingController = new WiseSayingController(); // 각 객체에 할당된 기능(등록, 목록 기능) 메서드를 호출하기 위한 클래스 인스턴스화

        System.out.println("===명언 앱==="); // 명언앱 안내문

        while (true) { //
            System.out.println("유효한 명령어 : 종료 / 등록 / 목록 / 삭제");
            System.out.print("명령 : "); // 명령 안내문
            String command = Container.getScanner().nextLine().trim();
            // 문자열자료형의 command변수에 스캐너에 한줄 입력되는걸 공백제거까지 해서 넣어주겠다.
            Rq rq = new Rq(command);

            switch (rq.getActionCode()) {
                case "종료":
                    systemController.종료();
                    return;
                case "도움말":
                    systemController.도움말();
                    break;
                case "등록":
                    wiseSayingController.등록();
                    break;
                case "목록":
                    wiseSayingController.목록();
                    break;
                case "삭제":
                    wiseSayingController.삭제(rq);
                    break;
                default:
                    System.out.println("유효하지 않은 명령어 입니다. 사용 가능한 명령어를 입력해주세요");
                    break;
            }
//
            if (rq.getActionCode().equals("종료")) { // if 문이 시작되는데, command에 종료라는 값이 입력되면,아래로직을 실행한다.
                // .equals로 변수의 '값'을 비교해준다.
                systemController.종료();
                break; // while 반복문 탈출

            } else if (rq.getActionCode().equals("등록")) { // command에 등록이라는 값이 입력되면, 아래 로직을 실행한다.
                wiseSayingController.등록();

            } else if (rq.getActionCode().equals("목록")) {
                wiseSayingController.목록();

            } else if (rq.getActionCode().equals("도움말")) {
                systemController.도움말();

            } else if (rq.getActionCode().startsWith("삭제")) { // command에 들어간 문자열 값 중에 '삭제'라는 단어가 포함되어있으면 아래 로직을 실행해라
                System.out.println("삭제 명령어 예시 : 삭제?id=$ & id=$ & id=$");
                System.out.println("$ = 삭제할 명언의 번호를 대입.(한 개도 가능)");
                System.out.printf("삭제 명령어 입력 : ");
                command = Container.getScanner().nextLine().trim();

                System.out.printf("actionCode는 %s\n", rq.getActionCode()); // actionCode를 나타내는 명령어 actionCode는 삭제
                System.out.printf("params.id는 %s\n", rq.getParams("id")); // params의 key와 value값을 나타내는 명령어 params는 {id=1}
                System.out.printf("params.authorName은 %s\n", rq.getParams("authorName")); // 잘 이해가 안됨
                System.out.printf("params.content는 %s\n", rq.getParams("content")); // 잘 이해가 안됨
                wiseSayingController.remove();
            } else {
                System.out.println("유효하지 않은 명령어 입니다. 사용 가능한 명령어를 입력해주세요");
            }

            //
        }
    }
}