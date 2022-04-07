package com.zxk.java.lambda;

import java.util.ArrayList;

public class 判断型接口 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("atguigu");
        list.add("ok");
        list.add("yes");

        list.forEach(str->System.out.println(str));
        System.out.println();

        list.removeIf(str->str.length()<5);
        list.forEach(str->System.out.println(str));
    }
}
