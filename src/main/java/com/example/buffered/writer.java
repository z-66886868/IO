package com.example.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/27 19:06
 */
public class writer {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c.txt"));

        bufferedWriter.write("劝君莫惜金缕衣，劝君惜取少年时");
        bufferedWriter.newLine();
        bufferedWriter.write("花开堪折直须折，莫待无花空折枝");


        bufferedWriter.close();

    }

}
