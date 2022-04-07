package com.zxk.java.lambda;

import com.zxk.java.sam.Calculator;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Java01 {
    @Test
    public void test01() {
        Java02.invokeCalc(4, 6, (int a, int b) -> {
            return a + b;
        });


    }


    @Test
    public void test02() {
        // TODO (形参列表) -> {Lambda体}
        //用Lambda表达式给Runnable接口的形参或变量赋值
        /*
         * 确定两件事，才能写好lambda表达式
         * （1）这个接口的抽象方法长什么样：
         * 		public void run()
         * （2）这个抽象方法的实现要干什么事
         * 		例如：我要打印“hello lambda"
         */

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("hello1");
            }
        };
        runnable.run();
        new Runnable() {

            @Override
            public void run() {
                System.out.println("hello2");
            }
        }.run();
        Runnable rr = () -> {
            System.out.println("hello3");
        };
        rr.run();
        Runnable r = () -> {
            System.out.println("hello4");

        };
        r.run();

        Runnable ll = () -> System.out.println("hello5");
        ll.run();

    }

    @Test
    public void test03() {
        //lambda体省略了{;}
        Runnable r = () -> System.out.println("hello lambda");
        System.out.println("r = " + r);

    }

    @Test
    public void test04() {
        String[] arr = {"hello", "Hello", "java", "Java"};

        //为arr数组排序，但是，想要不区分大小写
        /*
         * public static <T> void sort(T[] a,Comparator<? super T> c)
         * 这里要用Lambda表达式为Comparator类型的形参赋值
         *
         * 两件事：
         * （1）这个接口的抽象方法：  int compare(T o1, T o2)
         * （2）这个抽象方法要做什么事？
         * 		例如：这里要对String类型的元素，不区分大小写的比较大小
         */

		Arrays.sort(arr, (String o1, String o2) -> {return o1.compareToIgnoreCase(o2);});

        //省略了{return ;}
		Arrays.sort(arr, (String o1, String o2) ->  o1.compareToIgnoreCase(o2));

        //省略了两个String
        Arrays.sort(arr, (o1, o2) -> o1.compareToIgnoreCase(o2));

        for (String string : arr) {
            System.out.println(string);
        }
    }

    @Test
    public void test05() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("world");

        /*
         * JDK1.8给Collection系列的集合，准确的讲是在Iterable接口中，增加了一个默认方法
         * 		default void forEach(Consumer<? super T> action)
         * 这个方法是用来遍历集合等的。代替原来的foreach循环的。
         *
         * 这个方法的形参是Consumer接口类型，它是函数式接口中消费型接口的代表
         * 我现在调用这个方法，想要用Lambda表达式为Consumer接口类型形参赋值
         *
         * 两件事：
         * （1）它的抽象方法：  void  accept(T t)
         * （2）抽象方法的实现要完成的事是什么
         * 		例如：这里要打印这个t
         */
//		list.forEach((String t) -> {System.out.println(t);});

        //省略{;}
//		list.forEach((String t) -> System.out.println(t));

        //省略String
//		list.forEach((t) -> System.out.println(t));

        //可以省略形参()
        list.forEach(t -> System.out.println(t));
    }
    @Test
    public void test06(){
     int[] a= {4,5,6,2,6,8,6,98,23,235};
        Arrays.sort(a);
        /*for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }*/

    }

};
