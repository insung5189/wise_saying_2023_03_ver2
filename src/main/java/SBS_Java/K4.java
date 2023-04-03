package SBS_Java;

import java.util.Arrays;

public class K4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1,7);
        int[] arr3 = Arrays.copyOfRange(arr1,1, 3); // 배열 인덱스번호 1부터 번호2번 전까지 복사해준다.

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr1); // 배열을 오름차순으로 정렬
        System.out.println(Arrays.toString(arr1));
    }
}
