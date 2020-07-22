package cn.itcast.dao;

import org.springframework.stereotype.Repository;

@Repository("UserDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void findUsers() {
        System.out.println("UserDaoImpl1-----findUsers");
    }
}
