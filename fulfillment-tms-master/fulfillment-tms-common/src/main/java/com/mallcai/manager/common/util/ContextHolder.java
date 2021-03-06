package com.mallcai.manager.common.util;

import java.util.HashSet;
import java.util.Set;

/**
 * ContextHolder
 * @author zhanghao
 * @date 2019年08月13日23:41:35
 */
public class ContextHolder {

    /**
     * 线程变量的集合
     */
    private static Set<ThreadLocal> pool = new HashSet<>();

    /**
     * 注册
     */
    public static void register(ThreadLocal tl) {
        pool.add(tl);
    }

    /**
     * 清除所有注册的线程变量
     */
    public static void clean() {
        pool.forEach(ThreadLocal::remove);
    }

}
