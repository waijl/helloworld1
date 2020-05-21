package com.liushuang.one;



//单行注释

import java.io.File;
import java.util.ArrayList;

public class HelloWorld {
    void save(){

    }

    public static void main(String[] args) {
        ArrayList<Object> list = getArrayList();
        final boolean sss = list.add("sss");
        System.out.println(sss);

        String[] strings = {"liushuang", "zhouhongyan", "liufuxue"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String string : strings) {

        }
        for (int i = 0; i < strings.length; i++) {
            
        }
        for (int i = strings.length - 1; i >= 0; i--) {
            
        }



    }

    public static ArrayList<Object> getArrayList() {
        System.out.println("Hello World!!!");
        return new ArrayList<>();
    }
    public static void getFile(){
        File file = new File("new.txt");
        file.canRead();
    }
}
