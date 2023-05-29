package com.example.pojo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/28 13:40
 */
public class test {

    public static void main(String[] args) throws IOException {

        Student student = new Student("张三", 19,"北京");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d.txt"));

        objectOutputStream.writeObject(student);

        objectOutputStream.close();


    }

}
