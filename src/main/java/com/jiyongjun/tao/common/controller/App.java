package com.jiyongjun.tao.common.controller;


import com.jiyongjun.tao.common.model.User;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

/**
 * description:
 *
 * @author yongjun.ji
 * @date 2018/7/11 14:24
 */
public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // MyClassLoader classLoader = new MyClassLoader();
        // classLoader.loadClass("com.jiyongjun.tao.common.model.User");

        String wholeNameLine = "com.jiyongjun.tao.common.controller.Line";
        String wholeNamePoint = "com.jiyongjun.tao.common.controller.Point";
        System.out.println("下面是测试Classloader的效果");
        testClassloader(wholeNameLine, wholeNamePoint);
        System.out.println("----------------------------------");
        System.out.println("下面是测试Class.forName的效果");
        testForName(wholeNameLine, wholeNamePoint);
    }

    /**
     * classloader
     */
    private static void testClassloader(String wholeNameLine, String wholeNamePoint) {
        Class<?> line;
        Class<?> point;
        URLClassLoader loader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        try {
            line = loader.loadClass(wholeNameLine);
            point = loader.loadClass(wholeNamePoint);
            //demo = ClassloaderAndForNameTest.class.getClassLoader().loadClass(wholeNamePoint);//这个也是可以的
            System.out.println("line   " + line.getName());
            System.out.println("point   " + point.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Class.forName
     */
    private static void testForName(String wholeNameLine, String wholeNamePoint) {

        try {
            Class line = Class.forName(wholeNameLine);
            Class point = Class.forName(wholeNamePoint);
            System.out.println("line   " + line.getName());
            System.out.println("point   " + point.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
