package applicSpring.spring_boot_2.dao;


import applicSpring.spring_boot_2.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}