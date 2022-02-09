package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {

        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Lev", "Filippov", (byte) 23);
        userDaoHibernate.saveUser("Oleg", "Petrov", (byte) 21);
        userDaoHibernate.saveUser("Maks", "Ivanov", (byte) 35);
        userDaoHibernate.saveUser("Olga", "Makarova", (byte) 27);
        System.out.println(userDaoHibernate.getAllUsers());
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
    }
}