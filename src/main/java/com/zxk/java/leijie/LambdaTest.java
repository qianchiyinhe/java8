package com.zxk.java.leijie;
// 外部类->静态内部类->局部内部类->匿名内部类->lambda
public class LambdaTest {
    static class Student2 implements Person {//第2个,静态内部类

        @Override
        public void say() {
            System.out.println("王伟说组长说得对");
        }
    }
    public static void main(String[] args) {
        Person s1 = new Student1();
        s1.say();
        Person s2 = new Student2();
        s2.say();
       class Student3 implements Person{//第3个，局部内部类
            @Override
            public void say() {
                System.out.println("陈东浩说王伟说得对");
            }
        }
        Person s3 = new Student3();
        s3.say();
        Person s4 = new Person() {    //匿名内部类，没有类的名称，必须借助接口或者父类
            @Override
            public void say() {
                System.out.println("李世源说你们说得都对");
            }
        };
        s4.say();
        Person s5 = ()->{//lambda方法
            System.out.println("司光明微微一笑");
        };
        s5.say();
    }
}