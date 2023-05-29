package com.example.transfrom;

import com.example.pojo.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/28 13:43
 */
public class test2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d.txt"));

        Student student = (Student)objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(student);

    }

}
