package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:55 2019/9/5
 *@Modified By:
 */

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public List<User> findAll() {
        return userService.findAll();
    }
}
