package pakcage1;

import java.util.Scanner;

public class Container {
    private static Scanner sc;
    public static void init () {
      sc = new Scanner(System.in); // 스캐너 실행(시스템으로 값을 입력받겠다.)기능을 할당.
    }

    public static void close() {
        sc.close(); // 스캐너를 종료해주는 메서드(.close)
    }

    public static Scanner getScanner () { // 할당된 스캐너 변수 sc를 리턴할 수 있는 Scanner 타입 메서드
        return sc;
    }



}
