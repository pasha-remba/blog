package impl;

import dao.ArticleDAO;
import model.Article;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

/**
 * Created by Pasha on 02.11.2016.
 */
public class ArticleDAOImpl implements ArticleDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void createArticle(String nameUser, Date date, String body, String category, int rating, String title) {

    }

    @Override
    public String getArticle(long id) {
        return null;
    }

    @Override
    public List<Article> listArticles() {
        return null;
    }

    @Override
    public void deleteArticle(String title) {

    }

    @Override
    public void saveOrUpdateRating(String title) {

    }

    @Override
    public int getRating(String title) {
        return 0;
    }

}
