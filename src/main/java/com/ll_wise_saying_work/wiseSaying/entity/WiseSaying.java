package com.ll_wise_saying_work.wiseSaying.entity;

public class WiseSaying {
    private int id; // 명언 번호를 담을 지역변수 id 선언
    private String content; // 명언을 담을 지역변수 content선언
    private String authorName; // 작가를 담을 지역변수 authorName선언

    public WiseSaying(int id, String content, String authorName) {
        // 생성자를 만들어서 접근제한자(private)로 선언된 지역변수들에 매개변수로 받을 변수들을 재할당해줌.
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    }

    // 아래 3가지 메서드는 접근제한자(private)를 호출하기 위해 get메서드를 사용했으며,
    // 각각 명언번호(id), 명언(content), 작가(authorName)을 리턴하도록 한다.
    // 그리고 이것들은 App클래스의 for문에서 호출된다.
    public int getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setContents() {

    }

    public void setAuthorName() {

    }
}