package pakcage1.wiseSaying.entity;

public class WiseSaying {
    private int id; // 목록 기능에서 '번호' 값을 담기 위한 WiseSaying클래스의 인스턴스 변수
    private String wiseSaying; // 목록 기능에서 '명언' 값을 담기 위한 WiseSaying클래스의 인스턴스 변수
    private String authorName; // 목록 기능에서 '작가' 값을 담기 위한 WiseSaying클래스의 인스턴스 변수
    public WiseSaying (int id, String wiseSaying, String authorName) { // 각 번호, 명언, 작가 값을 매개변수로 받아줌.
        // 밑의 과정은 인스턴스 변수 안에 매개변수를 할당하는 과정
        // 그 이유는 인스턴스 변수가 private로 선언되었기 때문에 get메서드를 이용해서 불러와야 하기 때문.
        this.id = id;
        this.wiseSaying = wiseSaying;
        this.authorName = authorName;
    }
    public int getId() { // WiseSaying클래스의 인스턴스 변수 id를 다른 클래스에서 호출하기 위한 get메서드
        return id;
    }

    public String getWiseSaying() { // WiseSaying클래스의 인스턴스 변수 wiseSaying를 다른 클래스에서 호출하기 위한 get메서드
        return wiseSaying;
    }

    public String getAuthorName() { // WiseSaying클래스의 인스턴스 변수 authorName를 다른 클래스에서 호출하기 위한 get메서드
        return authorName;
    }
}
