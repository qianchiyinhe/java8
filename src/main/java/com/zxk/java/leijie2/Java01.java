package com.zxk.java.leijie2;

import org.junit.Test;

public class Java01 {
    @Test
    public void test01(){
        new B(){

            @Override
            public void show(int a, double d) {
                System.out.println(a+d);
            }
        }.show(2, 10.1);
    }
    @Test
    public void test02(){
        B b= (int a, double d)->{
            System.out.println(a+d);
        };
        b.show(100, 33.33);
    }
    @Test
    public void test03(){
        B b=(int a,double d)-> System.out.println(a+d);
        b.show(74, 45.2);
    }
    @Test
    public void test04(){
        B b =(e,f)-> System.out.println(f+e);
b.show(78, 23);
    }

}
