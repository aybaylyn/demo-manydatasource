package com.may.demo.service.ds1.impl;

import com.may.demo.entity.User;
import com.may.demo.repository.UserRepository;
import com.may.demo.service.ds1.UserServiceDs1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by May on 4/18/17.
 */
@Service
public class UserServiceDs1Impl implements UserServiceDs1 {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User findByName(String userName) {

        return  userRepository.findByName(userName);

    }
}
