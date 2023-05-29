package com.example.conpress;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/29 8:48
 */
public class unzip {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Fly\\Desktop\\aaa.zip");
        File dest = new File("C:\\Users\\Fly\\Desktop\\");

        unzip(file,dest);

    }
    
    public static void unzip(File src,File dest) throws IOException {

        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(src));

        ZipEntry nextEntry;

        while((nextEntry = zipInputStream.getNextEntry()) != null){
            if (nextEntry.isDirectory()){
                new File(dest,nextEntry.toString()).mkdir();
            }else{
                FileOutputStream fileOutputStream = new FileOutputStream(new File(dest,nextEntry.toString()));
                int b;
                while ((b = zipInputStream.read()) != -1){
                    fileOutputStream.write(b);
                }
                fileOutputStream.close();
                zipInputStream.closeEntry();
            }
        }

        zipInputStream.close();

    }

}
