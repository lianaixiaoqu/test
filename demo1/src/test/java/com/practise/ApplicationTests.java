package com.practise;

import com.demo.domain.p.User;
import com.demo.domain.p.UserRepository;
import com.demo.domain.s.Message;
import com.demo.domain.s.MessageRepository;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void test() throws Exception {

        User user=new User();
        user.setAge(1);
        user.setId(2);
        user.setLoginName("11");
        user.setName("11");
        user.setPassword("223");
        userRepository.save(user);

        Message  message=new Message();
        message.setName("asd");
        message.setId(11);
        message.setContent("asda");
        message.setMessage("asd");

        Assert.assertEquals(5, userRepository.findAll().size());

        messageRepository.save(message);


        Assert.assertEquals(3, messageRepository.findAll().size());

    }

}