package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;



public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Lev", "Filippov", (byte) 23);
        userDao.saveUser("Oleg", "Petrov", (byte) 21);
        userDao.saveUser("Maks", "Ivanov", (byte) 35);
        userDao.saveUser("Olga", "Makarova", (byte) 27);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}