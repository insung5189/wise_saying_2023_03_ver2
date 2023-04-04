package com.ll_wise_saying_work.wiseSaying.entity;

public class WiseSaying { 
    // 해당 클래스는 ArrayList에 명언번호, 명언, 작가 를 담을 용도로 만들어진 빌드 클래스임.
    // 고로 명언번호, 명언, 작가를 담을 고유 변수는 private 로 선언하고 실제로 다른 클래스에서 호출할 땐 getter를 사용하여 호출함.
    private int id; // 명언 번호를 담을 인스턴스변수 id 선언
    private String content; // 명언을 담을 인스턴스변수 content선언
    private String authorName; // 작가를 담을 인스턴스변수 authorName선언

    public WiseSaying(int id, String content, String authorName) {
        // 생성자를 만들어서 접근제한자(private)로 선언된 지역변수들에 매개변수로 받을 변수들을 재할당해줌.
        this.id = id; // 인스턴스변수 this.id에 매개변수로 받을 id값을 할당해줌.
        this.content = content; // 인스턴스변수 this.content에 매개변수로 받을 content값을 할당해줌.
        this.authorName = authorName; // 인스턴스변수 this.authorName에 매개변수로 받을 authorName값을 할당해줌.
    }

    // 아래 3가지 메서드는 접근제한자(private)를 호출하기 위해 get메서드를 사용했으며,
    // 각각 명언번호(id), 명언(content), 작가(authorName)을 리턴하도록 한다.
    // 그리고 이것들은 WiseSayingController클래스의 for문에서 호출된다.
    public int getId() {
        return this.id; // getId()로 인스턴스변수 id를 반환
    }

    public String getContent() {
        return this.content; // getContent()로 인스턴스변수 content를 반환
    }

    public String getAuthorName() {
        return this.authorName; // getAuthorName()로 인스턴스변수 authorName를 반환
    }

    public void setContents(String content) {
        this.content = content;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}