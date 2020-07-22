package cn.itcast.mapper;

import cn.itcast.dao.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void testDao() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("SpringContext.xml");

        UserDaoImpl dao = context.getBean(UserDaoImpl.class);
        dao.findUsers();

    }

    }

