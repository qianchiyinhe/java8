package com.zxk.java.stream;

import javafx.css.StyleOrigin;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Java01 {
    public static void main(String[] args) {
      //顺序流
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        Stream<Integer> stream = integers.stream();
        stream.forEach(System.out::println);

        System.out.println("------------------------------------");

    }
    @Test
    public void test02(){
        Consumer<String> fun = System.out::println;
        fun.accept("你好， 李华");
    }
}
