package cn.itcast.service;

import cn.itcast.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

//@Service("UserServiceImpl")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("UserDaoImpl")
    UserDao userDao;

    @Override
    public void findUsers() {
        userDao.findUsers();
    }
}
