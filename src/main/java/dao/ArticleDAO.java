package dao;


import model.Article;
import model.Category;
import model.User;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

public interface ArticleDAO {
    public void setDataSource(DataSource ds);

    public void createArticle(String nameUser, Date date, String body, String category, int rating, String title);

    public String getArticle(long id);

    public List<Article> listArticles();

    public void deleteArticle(String title);

    public void saveOrUpdateRating(String title);

    public int getRating(String title);
}
