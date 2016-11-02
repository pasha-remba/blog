package dao;

import model.Comment;
import model.User;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

public interface CommentDAO {
    public void setDataSource(DataSource ds);

    public void createComment(String nameUser, Date date, String body);

    public String getComment(String nameUser);

    public List<Comment> listComments();

    public void deleteComment(String nameUser);

    public void saveOrUpdateComment(Comment comment);
}
