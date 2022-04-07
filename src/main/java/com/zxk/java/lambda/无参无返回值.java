package com.zxk.java.lambda;

public class 无参无返回值 {
    public static void main(String[] args) {
        callSomething(()->System.out.println("回家吃饭"));
        callSomething(()->System.out.println("我爱你"));
        callSomething(()->System.out.println("滚蛋"));
        callSomething(()->System.out.println("回来"));
    }
    public static void callSomething(Call call){
        call.shout();
    }
}
interface Call {
    void shout();
}
