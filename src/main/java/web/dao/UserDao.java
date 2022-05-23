package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User updateUser(User user);

    User findById(int id);

    void deleteById(int id);

    List<User> findAll();
}

