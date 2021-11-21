/**
 * Copyright (C), 2015-2021
 * Description: 单例设计模式
 * <author>          <time>          <version>          <desc>
 * chenfz           2021/11/13 11:10           1.0              描述
 */
package com.chenfz.dp.singleton;

import java.util.Optional;

public class Mgr02 {

    private static Mgr02 INSTANCE;

    private Mgr02() { }

    /*
    * 静态内部类
    * */
    private static class innerMgr{
        private final static Mgr02 INSTANCE = new Mgr02();
    }

    public static Mgr02 getInstanceWithInnerClass(){
        return innerMgr.INSTANCE;
    }

    /*
    * 双重判断
    * */
    public static Mgr02 getInstance(){
        if (Optional.ofNullable(INSTANCE).isEmpty()){
            synchronized (Mgr02.class){
                if (Optional.ofNullable(INSTANCE).isEmpty()){
                    INSTANCE = new Mgr02();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Mgr01.getInstance().hashCode())).start();
        }
        System.out.println("-------------------------");
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(getInstanceWithInnerClass().hashCode())).start();
        }
    }
}
