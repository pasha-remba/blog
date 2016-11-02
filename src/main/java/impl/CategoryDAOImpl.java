package impl;

import dao.CategoryDAO;
import model.Category;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Pasha on 02.11.2016.
 */
public class CategoryDAOImpl implements CategoryDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void createCategory(String category) {

    }

    @Override
    public List<Category> listCategories() {
        return null;
    }

    @Override
    public void saveOrUpdateCategory(Category category) {

    }

}
