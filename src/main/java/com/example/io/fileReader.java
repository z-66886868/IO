package com.example.io;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/26 15:23
 */
public class fileReader {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("a.txt");

        int len = 0;
        char[] chars = new char[2];
        while((len = fileReader.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }

        fileReader.close();

    }

}
