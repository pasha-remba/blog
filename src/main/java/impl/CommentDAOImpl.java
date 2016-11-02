package impl;

import dao.CategoryDAO;
import dao.CommentDAO;
import model.Comment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

/**
 * Created by Pasha on 02.11.2016.
 */
public class CommentDAOImpl implements CommentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void createComment(String nameUser, Date date, String body) {

    }

    @Override
    public String getComment(String nameUser) {
        return null;
    }

    @Override
    public List<Comment> listComments() {
        return null;
    }

    @Override
    public void deleteComment(String nameUser) {

    }

    @Override
    public void saveOrUpdateComment(Comment comment) {

    }


}
