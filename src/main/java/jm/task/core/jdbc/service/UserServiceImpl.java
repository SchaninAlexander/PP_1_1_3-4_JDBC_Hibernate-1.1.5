package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static final UserDao userUserDaoHibernate = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userUserDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
        userUserDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userUserDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userUserDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userUserDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
        userUserDaoHibernate.cleanUsersTable();
    }
}
