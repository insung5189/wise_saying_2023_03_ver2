package pakcage1;

public class Main {
    public static void main(String[] args) {
        Container.init();
        // 스캐너 = 스캐너 기능을 가짐

        App.run(); // sc라는 값을 가진 객체와 run이라는 메서드를 호출
        // 그렇게 기능을 가진 '스캐너'를 App의 생성자 매개변수란에 넣어줌.

        Container.close();
         // 스캐너를 종료 스캐너가 계속 실행되고있으면 메모리소요가 크기 때문에 종료까지 정해줌.
    }
}