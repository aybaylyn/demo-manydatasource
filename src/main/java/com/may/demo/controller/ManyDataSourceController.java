package com.may.demo.controller;

import com.may.demo.entity.User;
import com.may.demo.service.ds1.UserServiceDs1;
import com.may.demo.service.ds2.UserServiceDs2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by May on 4/18/17.
 */

@RestController
@RequestMapping("/manydatasoures")
public class ManyDataSourceController {

    @Autowired
    private UserServiceDs1 userServiceDs1;

    @Autowired
    private UserServiceDs2 userServiceDs2;

    @RequestMapping("/test1")
    public User testDs1(String userName) {

        return userServiceDs1.findByName(userName);

    }

    @RequestMapping("/test2")
    public User testDs2(String userName) {
        return userServiceDs2.findByName(userName);
    }
}
