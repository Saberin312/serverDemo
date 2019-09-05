package com.example.demo.Node.Service;

import com.example.demo.Node.Dao.NodeDao;
import com.example.demo.Node.Entity.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 19:54 2019/9/5
 *@Modified By:
 */

@Service
public class NodeServiceImp implements NodeService {

    @Autowired
    NodeDao nodeDao;

    @Override
    public List<Node> findAll() {
        return nodeDao.findAll();
    }

    @Override
    public Node findById(Integer id) {
        return nodeDao.findById(id).get();
    }

    @Override
    public void update(Node node) {
        nodeDao.save(node);

    }

    @Override
    public void create(Node node) {
        nodeDao.save(node);

    }

    @Override
    public void deleteById(Integer id) {
        nodeDao.deleteById(id);

    }

    @Override
    public void deleteAll() {
        nodeDao.deleteAll();

    }



}
