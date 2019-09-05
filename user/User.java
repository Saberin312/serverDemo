package com.example.demo.user;

import lombok.Data;

import javax.persistence.*;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:43 2019/9/5
 *@Modified By:
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;



}
