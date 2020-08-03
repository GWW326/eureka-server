package com.gowin.mybatis_demo.user.web;

import com.gowin.mybatis_demo.user.dao.UserDao;
import com.gowin.mybatis_demo.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;
    @RequestMapping("/findUsers")
    public List<User> findAllUsers() throws Exception{
       return userDao.findAll();
    }
    @RequestMapping("/addUser")
    public void addUser() throws Exception{
        User user = new User("administrator", "administrator", "120");
        userDao.addUser(user);
    }
}
