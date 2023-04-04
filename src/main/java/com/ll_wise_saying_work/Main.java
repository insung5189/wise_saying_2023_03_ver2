package com.ll_wise_saying_work;
// 메인 영역
import java.util.Scanner; // 스캐너 유틸 불러옴

public class Main {
    public static void main(String[] args) {
        // 원래는 Main클래스에 스캐너 선언 및 할당 해주고 App으로 건내주었으나 스캐너의 로직구조 개선을 위해 Container클래스를 만들고 해당 클래스에서 생성 및 전달을 처리
        Container.init(); // Container 클래스에서 생성한 sc = new Scanner(System.in);가 담겨있는 클래스
        // sc = new Scanner(System.in);은 스캐너의 시스템으로 입력받는 기능을 sc라는 스캐너타입 변수에 할당한다는 뜻.

        new App().run(); //App에 있는 run 메서드 실행

        Container.close(); // 스캐너 기능 종료하여 불필요한 메모리 소요 줄임.(가비지 메모리 처리)
    }
}