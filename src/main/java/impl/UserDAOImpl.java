package impl;

import dao.UserDAO;
import model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Pasha on 02.11.2016.
 */
public class UserDAOImpl implements UserDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void createUer(String name, String email, String password, String role) {

    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public List<User> listUsers() {
        return null;
    }

    @Override
    public void deleteUser(long id) {

    }

    @Override
    public void saveOrUpdateUser(User user) {

    }


}
