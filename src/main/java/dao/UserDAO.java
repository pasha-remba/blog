package dao;

import model.User;

import javax.sql.DataSource;
import java.util.List;

public interface UserDAO {

    public void setDataSource(DataSource ds);

    public void createUer(String name, String email, String password, String role);

    public User getUser(long id);

    public List<User> listUsers();

    public void deleteUser(long id);

    public void saveOrUpdateUser(User user);

}
