package com.zxk.java.leijie2;

import java.util.Arrays;
import java.util.Comparator;

public class Java03 {
    public static void main(String[] args) {
        Integer[] arr={10,18,12,-7,9};
     //   Arrays.sort(arr);
       /* Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               // return 0;
               // return o1-o2;
                return o2-o1;
            }
        });*/
      Comparator<Integer> c= (d,e)->{
          return e-d;
      };
      //  Arrays.sort(arr,(d,e)->e-d);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
