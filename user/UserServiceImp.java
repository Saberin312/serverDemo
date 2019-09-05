package com.example.demo.user;

import com.example.demo.user.User;
import com.example.demo.user.UserDao;
import com.example.demo.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:58 2019/9/5
 *@Modified By:
 */

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
