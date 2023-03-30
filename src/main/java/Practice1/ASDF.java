package Practice1;

import java.util.ArrayList;
import java.util.Scanner;

public class ASDF {
    public static void main(String[] args) {

        Sol2.run();
    }
}
class Sol2 {
    public static void run() {
        Scanner sc = new Scanner(System.in); // sc라는 변수에 스캐너 객체를 담아서 실행해줌.
        ArrayList<Integer> numbers = new ArrayList<>(); // ArrayList<>를 이용해서 numbers라는 변수에 arraylist 기능을 담아줌(*numbers = 가변적 배열*)

        while (true) { // 조건에맞는 반복(-1이 되면 break;가 실행)을 위한 반복문
            System.out.print("숫자를 입력해주세요(-1 : 종료) : "); // 입력을 안내해주는 안내문
            int num1 = sc.nextInt(); // Scanner로 정수형 숫자를 받기위한 함수.(콘솔창에 정수를 입력하면 일시적으로 해당 숫자는 num1에 담김)
            System.out.printf("입력한 숫자(오름차순) : %d \n", num1); // 입력한 숫자를 알려주는 안내문

            if (num1 == -1) { // 반복문에서 break;가 실행되게 하기 위한 조건문.
                System.out.println("입력을 종료합니다."); // 입력을 종료한다는 안내문
                break; // 조건문 내부에서 조건에 부합하면 break;가 실행되면서 반복문이 멈춤.
            }

            numbers.add(num1); // ArrayList기능을 담아준 numbers에 num1변수를 담아서 배열 인덱스로 추가해줌.
            // 18번 줄에서 num1에 스캐너로 숫자를 담아줬고 그 값들을 numbers라는 배열에 순차적으로 추가해줌.
        }
        System.out.println(numbers); // numbers를 호출(num1에 입력한 )


        System.out.println("프로그램을 종료합니다."); // 종료멘트

        sc.close(); // 스캐너를 끝내줌(불필요한 메모리 소요 끊음)
    }

}
