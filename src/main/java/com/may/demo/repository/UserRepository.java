package com.may.demo.repository;


import com.may.demo.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by May on 3/16/17.
 */
@Repository
public interface UserRepository {

    User findByName(String userName);
}
