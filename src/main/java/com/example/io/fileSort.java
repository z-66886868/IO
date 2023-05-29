package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/27 17:16
 */
public class fileSort {

    public static <R> void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("a.txt");
        StringBuffer sb = new StringBuffer();

        char[] chars = new char[1024];
        int len;
        while ((len = fileReader.read(chars)) != -1){
            sb.append(chars,0,len);
        }
        fileReader.close();

        Integer[] integers = Arrays.stream(sb.toString().split("-"))
                .map(s -> Integer.parseInt(s))
                .sorted()
                .toArray(Integer[]::new);

        String replace = Arrays.toString(integers).replace(", ", "-");
        String result = replace.substring(1, replace.length() - 1);

        FileWriter fileWriter = new FileWriter("a.txt");
        fileWriter.write(result);
        fileWriter.close();

    }

}
