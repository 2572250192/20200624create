package com.gec;
//饿汉
public class Single1 {
    private Single1() {
    }

    private static Single1 instance =new Single1();

    public static Single1 getInstance() {
        return instance;
    }
}
