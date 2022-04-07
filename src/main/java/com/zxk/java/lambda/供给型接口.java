package com.zxk.java.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class 供给型接口 {
    @Test
    public void test01(){
        Supplier<String> s1 = new Supplier<String>() {
            @Override
            public String get() {
                return "王安石";
            }
        };
        String s = s1.get();

        Supplier<Integer> s2 = ()->20;
        System.out.println("s2.get() = " + s2.get());

        System.out.println("s = " + s);

    }
    @Test
    public void test11(){

    }
    @Test
    public void test2(){
        Stream.generate(() -> Math.random()).forEach(num -> System.out.println(num));
    }
}
