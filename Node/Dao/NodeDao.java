package com.example.demo.Node.Dao;

import com.example.demo.Node.Entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 19:47 2019/9/5
 *@Modified By:
 */

@Component
public interface NodeDao extends JpaRepository<Node, Integer> {


}
