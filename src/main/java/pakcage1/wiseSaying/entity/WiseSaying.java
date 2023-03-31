package pakcage1.wiseSaying.entity;

public class WiseSaying {
    private int id;
    private String author;
    private String saying;

    public WiseSaying(int id, String author, String saying) {
        this.id = id;
        this.author = author;
        this.saying = saying;
    }

    public int getId() {
        return this.id;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getSaying() {
        return saying;
    }
    public String getList() {
        return this.id + " / " + this.author + " / " + this.saying;
    }
}