package com.example.demo.Node.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Timestamp;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 19:32 2019/9/5
 *@Modified By:
 */


@Data
@Entity
@Table(name = "node")

@Getter
@Setter
@ToString
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Timestamp timestamp;
    private Double value;



}
