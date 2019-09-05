package com.example.demo.user;

import com.example.demo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:57 2019/9/5
 *@Modified By:
 */

@Component
public interface UserDao extends JpaRepository<User, Integer> {

}
