package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest
{
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    {
        // 三种获取Class对象的方式
        Class<String> c1 = String.class;
        Class<?> c2 = "hello".getClass();
        Class<?> c3 = Class.forName("java.lang.String");


        Class<?> c4 = ReflectionTest.class;
        System.out.println(c1 == c2);  // true
        System.out.println(c2 == c3);  // true
        System.out.println(c1 == c4);  // true

        // 基本类型也有Class对象
        Class<Integer> intClass = int.class;
        Class<Void> voidClass = void.class;

        // 数组也有Class对象
        Class<String[]> arrayClass = String[].class;

        // 获得实例
        // 1. 使用newInstance()方法（已弃用，Java 9+）
        Class<String> stringClass = String.class;
        String str1 = stringClass.newInstance(); // 调用无参构造

        // 2. 使用getConstructor.newInstance()
        Constructor<String> constructor = stringClass.getConstructor(String.class);
        String str2 = constructor.newInstance("Hello");

        // 3. 更加安全的现代方式
        String str3 = stringClass.getDeclaredConstructor().newInstance();
    }
}