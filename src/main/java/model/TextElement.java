package model;

import java.util.Date;

public abstract class TextElement extends Entity {
    private Date date;
    private String body;

    TextElement(long id, String nameUser, Date date, String body) {
        super(id, nameUser);
        this.date = date;
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
}
