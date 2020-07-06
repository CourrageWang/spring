package com.xiyou.java.hello.confbean.conf;

import com.xiyou.java.hello.confbean.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConf.class)
public class AppConfTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        userDao.add();
    }
}
