package hhyingzi.novelweb.novel.Entity;

import org.springframework.data.annotation.Id;

public class Overview {
    @Id private String id;

    private String title;
    private Info info;

    public Overview(String title, Info info) {
        this.title = title;
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Overview{" +
                "title='" + title + '\'' +
                ", info=" + info +
                '}';
    }
}
