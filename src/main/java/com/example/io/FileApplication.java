package com.example.io;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * @author Fly
 */
public class FileApplication {

    public static void main(String[] args) throws IOException {

//        File file1 = new File("C:\\Users\\Fly\\Desktop\\aaa\\bbb.txt");
//        System.out.println(file1.length());
//
//        File file2 = new File("C:\\Users\\Fly\\Desktop\\aaa\\ccc.txt");
//        System.out.println(file2.createNewFile());
//
//        File file3 = new File("C:\\Users\\Fly\\Desktop\\aaa\\ccc.txt");
//        System.out.println(file3.isFile());

        File file4 = new File("C:\\Users\\Fly\\Desktop\\aaa");
//        System.out.println(deleteFile(file4));
//        System.out.println(findFile(file4));
        HashMap<String, Integer> count = getCount(file4);
        Set<Map.Entry<String, Integer>> entries = count.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //File[] files = file4.listFiles();
//        for (File file : files) {
//            if (file.isFile() && file.getName().endsWith(".txt")){
//                System.out.println(true);
//            }
//        }

//        File file5 = new File("C:\\Users\\Fly\\Desktop\\aaa\\ddd");
//        System.out.println(file5.mkdir());
//
//        File file6 = new File("C:\\Users\\Fly\\Desktop\\aaa\\ddd\\eee\\fff");
//        System.out.println(file6.delete());

    }

    public static int findFile(File file){
        int i = 0;
        File[] files = file.listFiles();

        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".txt")){
                i++;
            }
        }
        return i;
    }

    public static boolean deleteFile(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (!f.delete()){
                if (deleteFile(f)){
                    f.delete();
                }
            }
        }
        return true;
    }

    public static HashMap<String,Integer> getCount(File file){

        HashMap<String, Integer> hashMap = new HashMap<>();
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                String name = f.getName();
                String[] split = name.split("\\.");
                String s = split[split.length - 1];
                if (hashMap.containsKey(s)){
                    int count = hashMap.get(s);
                    count++;
                    hashMap.put(s,count);
                }else{
                    hashMap.put(s,1);
                }
            }else{
                HashMap<String, Integer> sonMap = getCount(f);

                Set<String> keys = sonMap.keySet();
                for (String key : keys) {
                    if (hashMap.containsKey(key)){
                        int count = hashMap.get(key) + sonMap.get(key);
                        hashMap.put(key,count);
                    }else{
                        Integer count = sonMap.get(key);
                        hashMap.put(key,count);
                    }
                }
            }
        }

        return hashMap;

    }

}

