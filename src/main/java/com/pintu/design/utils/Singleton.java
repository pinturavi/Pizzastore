package com.pintu.design.utils;

class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    static synchronized Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }
}
