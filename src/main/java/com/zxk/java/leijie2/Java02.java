package com.zxk.java.leijie2;

import org.junit.Test;

public class Java02 {
    @Test
    public void test01(){
        //要接收返回值
      int 接收=  new C(){

            @Override
            public int show(int a, int b) {
                System.out.println(a*b);
              return a*b;
            }
        }.show(4, 5);

    }
    @Test
    public void test02(){
        C c =(a,b)->{
            System.out.println("----------");
            return a+b;

        };
int sum = c.show(78, 45);
        System.out.println("sum = " + sum);
    }
    @Test
    public void test03(){
       /* C c=(e,f)->{
            return e%f;

        };*/
        C c= (e,f)->e*f;
        System.out.println(c.show(9,3));
    }

}
