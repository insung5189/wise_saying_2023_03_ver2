package SBS_Java;

import java.util.Arrays;

public class K3 {
    public static void main(String[] args) {
        // Arrays.equal(배열1, 배열2) 1차원 배열1, 배열2를 비교함

        int[] arr11 = {1, 2, 3, 4, 5};
        int[] arr12 = {1, 2, 3, 4, 5};
        System.out.println("일차원배열비교(arr11 == arr12) : " + (arr11 == arr12)); // 해당 배열의 주소값을 비교함.
        System.out.println("일차원배열비교(Arrays.equals(arr11, arr12)) : " + (Arrays.equals(arr11, arr12))); // 해당 배열의 실제값을 비교함.

        System.out.println("------------");

        int[][] arr21 = {{1, 2}, {3, 4}};
        int[][] arr22 = {{1, 2}, {3, 4}};
        System.out.println("다차원배열비교Arrays.deepEquals(arr21, arr22) : " + Arrays.deepEquals(arr21, arr22)); // 해당 배열의 실제값을 비교함.
        System.out.printf("다차원배열비교Arrays.equals(arr21[0], arr22[0]) : " + Arrays.equals(arr21[0], arr22[0]) + "\n!!다차원배열의 인덱스값으로 접근해서 일차원배열처럼 비교 가능!!\n"); // 다차원배열의 인덱스값으로 접근해서 일차원배열처럼 비교 가능

    }
}
