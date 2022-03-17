package hhyingzi.novelweb;

import org.springframework.data.annotation.Id;

public class Info {
    @Id private String id;

    private String author;
    private String last_read_chapter;
    private String last_chapter;
    private String update_date;
    private String pretty_update_date;
    private String now;

    public Info(String author, String last_read_chapter, String last_chapter, String update_date, String pretty_update_date, String now) {
        this.author = author;
        this.last_read_chapter = last_read_chapter;
        this.last_chapter = last_chapter;
        this.update_date = update_date;
        this.pretty_update_date = pretty_update_date;
        this.now = now;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLast_read_chapter() {
        return last_read_chapter;
    }

    public void setLast_read_chapter(String last_read_chapter) {
        this.last_read_chapter = last_read_chapter;
    }

    public String getLast_chapter() {
        return last_chapter;
    }

    public void setLast_chapter(String last_chapter) {
        this.last_chapter = last_chapter;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getPretty_update_date() {
        return pretty_update_date;
    }

    public void setPretty_update_date(String pretty_update_date) {
        this.pretty_update_date = pretty_update_date;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    @Override
    public String toString() {
        return "Info{" +
                "author='" + author + '\'' +
                ", last_read_chapter='" + last_read_chapter + '\'' +
                ", last_chapter='" + last_chapter + '\'' +
                ", update_date='" + update_date + '\'' +
                ", pretty_update_date='" + pretty_update_date + '\'' +
                ", now='" + now + '\'' +
                '}';
    }
}
