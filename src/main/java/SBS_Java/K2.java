package SBS_Java;

import java.util.Arrays;

public class K2 {
    public static void main(String[] args) {
        int[] arr = {1, 52, 58, 2, 56, 52, 58, 2};
        int[][] arr2 = {{1, 2},{3, 4},{5, 6}};
        int[][][] arr3 = {{{1, 3}, {2, 5}}, {{4, 8}, {6, 7}}};

        System.out.println(Arrays.toString(arr)); // 1차원배열을 일반적인 텍스트로 출력
        System.out.println(Arrays.toString(arr2)); // 배열을 일반적인 텍스트로 출력 (2차원배열 이상은 주소값이 나옴)
        System.out.println(Arrays.deepToString(arr2)); // 2차원배열 이상도 값을 출력할 수 있음.
        System.out.println(Arrays.deepToString(arr3)); // 2차원배열 이상도 값을 출력할 수 있음.
        System.out.println(Arrays.deepToString(arr3[0])); // 2차원배열 이상 인덱스값도 지정해서 출력 가능.
        System.out.println(Arrays.toString(arr3[1][1])); // 2차원배열 이상 중 원하는값도 출력 가능.
    }
}
