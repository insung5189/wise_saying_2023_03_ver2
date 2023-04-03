package SBS_Java;

import java.util.Scanner;
import java.util.Arrays;

public class K1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "abcabc";
        char b = a.charAt(3); // 0부터 셈(index)
        System.out.println(b);
        System.out.println("-------");

//        변수의 이름.length();
        System.out.println(a.length()); // 1부터 셈.
        System.out.println(a.substring(4)); // 4번 인덱스부터 끝까지 반환
        System.out.println(a.substring(2, 5)); // 2번 인덱스부터 5번의 전까지 반환
        sc.close();
    }
}
