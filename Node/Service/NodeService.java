package com.example.demo.Node.Service;

import com.example.demo.Node.Entity.Node;

import java.util.List;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 19:48 2019/9/5
 *@Modified By:
 */
public interface NodeService {
    List<Node> findAll();

    Node findById(Integer id);

    void update(Node node);

    void create(Node node);

    void deleteById(Integer id);

    void deleteAll();


}
