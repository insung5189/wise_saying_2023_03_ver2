package com.ll_wise_saying_work;

import java.util.Scanner;

public class Container {
    public static Scanner sc; // 공공접근자로 Scanner타입 sc 변수선언

    public static void init() { // 클래스에 직접 접근해서 사용해야 해서 static을 사용
        sc = new Scanner(System.in);
    }
    public static void close() { // 해제(스캐너 기능 종료 메서드)
        sc.close();
    }
    public static Scanner getScanner () { // 직접적인 스캐너 기능을 호출당하는 메서드
        return sc;
    }
}