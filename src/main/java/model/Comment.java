package model;

import java.util.Date;

public class Comment extends TextElement{

    private String target;

    Comment(long id, String nameUser, Date date, String body) {
        super(id, nameUser, date, body);
    }
}
