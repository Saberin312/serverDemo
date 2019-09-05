package com.example.demo.Node.Controller;

import com.example.demo.Node.Entity.Node;
import com.example.demo.Node.Service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 21:14 2019/9/5
 *@Modified By:
 */

@RequestMapping("/node")
@RestController
public class NodeController {
    @Autowired
    NodeService nodeService;

    @RequestMapping("/list")
    public List<Node> findAll() {
        return nodeService.findAll();
    }

    @RequestMapping("/{id}")
    public Node findById(@PathVariable Integer id) {
        return nodeService.findById(id);
    }

    @RequestMapping("/addnode")
    public void creat(@RequestParam Node node) {
        nodeService.create(node);

    }

    @RequestMapping("/update")
    public void update(@RequestParam Node node) {
        nodeService.update(node);

    }

    @RequestMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id) {
        nodeService.deleteById(id);

    }

    @RequestMapping("/deleteAll")
    public void deleteAll() {
        nodeService.deleteAll();
    }

}
