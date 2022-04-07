package com.zxk.java.lambda;

import org.junit.Test;

import java.util.HashMap;

public class 功能型接口实现类 {
    public static void main(String[] args) {
      HashMap<Integer, 功能型接口>  map = new HashMap<>();
        功能型接口 张三 = new 功能型接口(1, "张三", 8000);
        功能型接口 李四 = new 功能型接口(2, "李四", 9000);
        功能型接口 王五 = new 功能型接口(3, "王五", 5000);
        功能型接口 马六 = new 功能型接口(4, "马六", 6000);
        map.put(张三.getId(),张三);
        map.put(李四.getId(),李四);
        map.put(王五.getId(),王五);
        map.put(马六.getId(),马六);
        map.forEach((k,v) -> System.out.println(k+"="+v));
        System.out.println();

        map.replaceAll((k,v)->{
            if(v.getSalary()<10000){
                v.setSalary(10000);
            }
            return v;
        });
        map.forEach((k,v) -> System.out.println(k+"="+v));
    }
    @Test
    public void test(){

            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "李白");
            map.put(2, "杜甫");
            map.put(3, "王安石");
            map.put(5, "居易白");
            map.put(4, "李商隐");
      /*  map.replaceAll((k,v)->{
            if(v.endsWith("白")){
                return "666";
            }
            return v;
        });*/
       /* map.replaceAll((k, v) -> {
            return v.endsWith("白") ? "666" : v;
        });*/
            map.replaceAll((a, b) -> b.endsWith("白") ? "666" : b);
            System.out.println(map);
    }
    }


