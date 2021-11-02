package com.lds.demo.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/9/18 上午9:45
 */
public class Test1 {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException {
        //test();
        testArray();
    }

    public static void testArray() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.String");
        Object array = Array.newInstance(cls,25);
        //往数组里添加内容
        Array.set(array,0,"hello");
        Array.set(array,1,"Java");
        Array.set(array,2,"fuck");
        Array.set(array,3,"Scala");
        Array.set(array,4,"Clojure");
        //获取某一项的内容
        System.out.println(Array.get(array,3));
    }

    public static void test() throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        Class<?> c = methodClass.class;
        Object object = c.newInstance();
        Method[] methods = c.getMethods();
        Method[] declaredMethods = c.getDeclaredMethods();
        //获取methodClass类的add方法
        Method method = c.getMethod("add", int.class, int.class);
        //getMethods()方法获取的所有方法
        System.out.println("getMethods获取的方法：");
        for (Method m : methods)
            System.out.println(m);
        //getDeclaredMethods()方法获取的所有方法
        System.out.println("getDeclaredMethods获取的方法：");
        for (Method m : declaredMethods)
            System.out.println(m);
        System.out.println(method);
    }
}

class methodClass {
    public final int fuck = 3;

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a + b;
    }
}
