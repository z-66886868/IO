package com.example.io;

import java.io.*;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/26 21:47
 */
public class mkdirCopy {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Fly\\Desktop\\aaa");
        File dest = new File("C:\\Users\\Fly\\Desktop\\bbb");

        copyMkdir(file,dest);

    }

    public static void copyMkdir(File file,File dest) throws IOException {
        dest.mkdir();
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                FileInputStream input = new FileInputStream(f);
                FileOutputStream out = new FileOutputStream(dest + "\\" + f.getName());
                byte[] bytes = new byte[1024];
                int len = 0;
                while ((len = input.read(bytes)) != -1 ){
                    out.write(bytes,0,len);
                }
                out.close();
                input.close();
            } else{
                copyMkdir(f, new File(dest , f.getName()));
            }
        }

    }

}
