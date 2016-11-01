package model;

import java.util.Date;

@Entity
public class Comment extends TextElement{

    private String target;

    Comment(long id, String name, Date date, String body, User author, String target) {
        super(id, name, date, body, author);
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
