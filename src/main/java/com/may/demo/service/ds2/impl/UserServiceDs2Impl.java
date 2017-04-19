package com.may.demo.service.ds2.impl;

import com.may.demo.entity.User;
import com.may.demo.repository.UserRepository;
import com.may.demo.service.ds2.UserServiceDs2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by May on 4/18/17.
 */
@Service
public class UserServiceDs2Impl implements UserServiceDs2 {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByName(String userName) {
        return userRepository.findByName(userName);
    }
}
