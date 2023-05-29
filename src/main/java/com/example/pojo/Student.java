package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/28 13:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 4480625706538995574L;

    private String name;
    private int age;
    private transient String address;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



}
