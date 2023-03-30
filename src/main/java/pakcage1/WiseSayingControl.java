package pakcage1;

public class WiseSayingControl {
    private int id;
    private String content;
    private String authorName;

    WiseSayingControl(int id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    }

    public int getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthorName() {
        return this.authorName;
    }
}