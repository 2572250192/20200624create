package com.gec;

public class Single2 {
    private Single2() {
    }

    private static Single2 instance = null;

    public static synchronized Single2 getInstance(){
        if (instance == null){
            instance = new Single2();
        }
        return instance;
    }
}
