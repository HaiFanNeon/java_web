package dao.impl;

import dao.UserDao;
import db.MySQLDB;
import pojo.User;

public class UserDaoImpl implements UserDao {
    private MySQLDB mySQLDB = new MySQLDB();
    @Override
    public void insert(User user) {
        mySQLDB.executeSqlInsert(user);
    }

    @Override
    public void delete(int id) {
        mySQLDB.executeSqlDelete(id);
    }

    @Override
    public void Select(int id) {
        mySQLDB.select(id);
    }

    @Override
    public void SellectAll() {
        mySQLDB.selectAll();
    }
}
