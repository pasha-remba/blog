package model;

import java.util.Date;

public abstract class TextElement extends Entity {
    private Date date;
    private String body;
    private User author;

    TextElement(long id, String name, Date date, String body, User author) {
        super(id, name);
        this.date = date;
        this.author = author;
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return author;
    }

    public void setUser(User author) {
        this.author = author;
    }
}
