/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Mgr03
 * Author:   chenfz
 * Date:     2021/11/21 11:26
 * Description: 枚举类实现单例，effective java 推荐
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.dp.singleton;

/**
 * 〈一句话功能简述〉<br> 
 * 〈枚举类实现单例，effective java 推荐〉
 *
 * @author chenfz
 * @create 2021/11/21
 * @since 1.0.0
 */
public enum Mgr03 {

    INSTANCE;

    public void m(){
        System.out.println("m: "+ this.hashCode());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(Mgr03.INSTANCE::m).start();
        }
    }
}
