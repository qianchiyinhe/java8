package com.zxk.java.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 消费型接口 {
    @Test
    public void test1(){
        List<String> list = Arrays.asList("java","c","python","c++","VB","C#");
        list.forEach(s -> System.out.println(s));
    }
    @Test
    public void test2(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "java");
        map.put(2, "c");
        map.put(3, "python");
        map.put(4, "c++");
        map.put(5, "VB");
        map.put(6, "C#");
        map.forEach((k,v) -> System.out.println(k+"->"+v));
    }
}
