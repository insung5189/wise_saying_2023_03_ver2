package pakcage1.system.controller;

public class SystemController {

    public void 종료() {
        System.out.println("프로그램이 종료되었습니다."); // 프로그램이 종료되었다는 안내문 출력
    }

    public void 도움말() {
        System.out.println("1. 종료"); // 종료 안내문
        System.out.println("2. 등록"); // 등록 안내문
        System.out.println("3. 목록"); // 목록 안내문
        System.out.println("=============="); // 구획선 안내문
    }
}
