package com.example.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/26 21:43
 */
public class fileWrite {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("a.txt");

        fileWriter.write("abcdef");
        fileWriter.flush();

        fileWriter.write("\r\nghijkl");
        fileWriter.flush();

        fileWriter.close();

    }

}
