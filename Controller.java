package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:39 2019/9/5
 *@Modified By:
 */

@RestController
public class Controller {
    @RequestMapping("/hello")
    public String hello (){
        return "hello world!";
    }
}
