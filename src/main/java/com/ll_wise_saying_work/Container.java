package com.ll_wise_saying_work;

import java.util.Scanner;

public class Container {
    public static Scanner sc; // 스캐너타입 sc를 공공접근자로 선언.
    // Container클래스에 스캐너 기능을 생성 및 할당해주었으니, 스캐너의 기능을 이용하기 위해선 다른 클래스에서 직접 접근해서 사용해야 하기때문에 static을 사용
    public static void init() { // Main 클래스에서 Container.init();로 호출한 init 메서드
        sc = new Scanner(System.in); // sc = new Scanner(System.in);은 스캐너의 시스템으로 입력받는 기능을 sc라는 스캐너타입 변수에 할당한다는 뜻.
    }
    public static void close() { // Main 클래스에서 Container.close();로 호출한 close 메서드 (실행중인 스캐너의 기능을 종료해줌.)
        sc.close(); // .close를 이용하여 스캐너 기능 종료. 불필요한 메모리 소모 막아줌.
    }
    public static Scanner getScanner () { // getter를 사용하여 스캐너 기능이 할당된 sc변수를 리턴함, 다른 클래스에선 Container.getScanner()로 연결됨.
        return sc; // 스캐너 기능이 담긴 sc변수를 리턴함.
    }
}