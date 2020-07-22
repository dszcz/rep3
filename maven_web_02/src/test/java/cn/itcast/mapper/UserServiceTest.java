package cn.itcast.mapper;

import cn.itcast.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {


@Test
    public void testService() {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("SpringContext.xml");
    UserServiceImpl bean = context.getBean(UserServiceImpl.class);
    //UserServiceImpl bean = (UserServiceImpl) context.getBean("UserServiceImpl");
    bean.findUsers();

}

}

