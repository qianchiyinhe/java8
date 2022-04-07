package com.zxk.java.lambda;

import com.zxk.java.sam.Calculator;

public class Java02 {

        public static void invokeCalc(int a, int b, Calculator calculator) {
            int result = calculator.calc(a, b);
            System.out.println("结果是：" + result);
        }
    public static void main(String[] args) {
        invokeCalc(1, 2, (int a,int b)-> {return a+b;});
        invokeCalc(1, 2, (int a,int b)-> {return a-b;});
        invokeCalc(1, 2, (int a,int b)-> {return a*b;});
        invokeCalc(1, 2, (int a,int b)-> {return a/b;});
        invokeCalc(1, 2, (int a,int b)-> {return a%b;});
        invokeCalc(1, 2, (int a,int b)-> {return a>b?a:b;});
    }
}
