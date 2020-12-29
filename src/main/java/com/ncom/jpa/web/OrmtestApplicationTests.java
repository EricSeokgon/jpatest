package com.ncom.jpa.web;

import com.ncom.jpa.web.domain.Member;
import com.ncom.jpa.web.domain.Teacher;
import com.ncom.jpa.web.domain.User;
import com.ncom.jpa.web.reopsitory.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrmtestApplicationTests {

    private Logger logger = LoggerFactory.getLogger(OrmtestApplicationTests.class);

    @Autowired
    private UserRepository userRepository;

    @Test
    public void jpaQueryTest(){

        List<Optional<User>> userList = userRepository.getUserList();
        for(Optional<User> user : userList ){
            logger.info("#### User Info : " + user);
        }
    }
}