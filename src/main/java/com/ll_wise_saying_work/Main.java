package com.ll_wise_saying_work;
// 메인 영역
import java.util.Scanner; // 스캐너 유틸 불러옴

public class Main {
    public static void main(String[] args) {
        Container.init(); // Container 클래스에서 다시 선언및 초기화된 sc(스캐너 기능)가 담긴 init메서드를 호출함.

        new App().run(); // App클래스를 객체화 해서 App에 있는 App생성자에 sc 받아주고 run 메소드 실행.
        // App에 sc를 매개변수로 넣어줌으로써 Main클래스에서 활성화된 스캐너가 입력받아서 App클래스까지 연결 가능해짐.

        Container.close(); // 스캐너 기능 종료하여 불필요한 메모리 소요 줄임.(가비지 메모리 처리)
    }
}