package Practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {

        Sol1.run();

    }
}

class Sol1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

//        int[] numbers = new int[20];

//        Arrays.fill(numbers, -1);
//        int numbersIndex = -1;

        while (true) {
            System.out.print("숫자를 입력해주세요(-1 : 종료) : ");
            int num1 = sc.nextInt();
            System.out.printf("입력한 숫자(오름차순) : %d \n", num1);

            if (num1 == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }
//            numbersIndex++;
//            numbers[numbersIndex] = num1;
            numbers.add(num1);
        }
//        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);


        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }

}
