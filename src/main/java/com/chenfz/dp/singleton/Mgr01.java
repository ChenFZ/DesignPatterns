/**
 * Copyright (C), 2015-2021
 * Description: 单例设计模式
 * <author>          <time>          <version>          <desc>
 * chenfz           2021/11/13 11:10           1.0              描述
 */
package com.chenfz.dp.singleton;

public class Mgr01 {

    private final static Mgr01 INSTANCE = new Mgr01();

    private Mgr01() { }

    public static Mgr01 getInstance(){ return INSTANCE;}

    public static void main(String[] args) {
        //for (int i = 0; i < 100; i++) {
        //    new Thread(()-> System.out.println(Mgr01.getInstance().hashCode())).start();
        //}
        Mgr01 instance = getInstance();
        Mgr01 instance1 = getInstance();
        System.out.println(instance1 == instance);
    }
}
