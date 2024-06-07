package dao;

import pojo.User;

public interface UserDao {

    void insert(User user);

    void delete(int id);

    void Select(int id);

    void SellectAll();
}
