package dao;

import model.Category;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

public interface CategoryDAO {
    public void setDataSource(DataSource ds);

    public void createCategory(String category);

    public List<Category> listCategories();

    public void saveOrUpdateCategory(Category category);
}
