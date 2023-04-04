package com.ll_wise_saying_work.system.controller;
// 명언앱 >> 시스템컨트롤러 영역
/*
시스템모듈
명언모듈
빌드모듈
이 3가지를 구분하기 위해서 만들어줌
**리팩토링 작업**
*/
public class SystemController { // 시스템 모듈 영역이라 시스템 관련된 종료를 이 부분에 넣어줌
    public void 종료() { // App클래스에 switch문에서 systemController.종료();가 호출되면 실행될 메서드
        System.out.println("프로그램이 종료되었습니다."); // 종료 메서드 실행시 출력 안내문
    }
}
