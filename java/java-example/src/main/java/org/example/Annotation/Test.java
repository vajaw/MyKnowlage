package org.example.Annotation;

import java.lang.reflect.Method;

public class Test
{
    public static void main(String[] args)
    {
        // 获取类的字节码对象
        Class<MyClass> clazz = MyClass.class;

        // 遍历类中的所有方法
        for (Method method : clazz.getDeclaredMethods()) {
            // 检查方法是否有 @MyAnnotation 注解
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                // 获取注解
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

                // 输出注解信息
                System.out.println("方法名: " + method.getName());
                System.out.println("注解值: " + annotation.value());
                System.out.println("注解版本: " + annotation.version());
            }
        }
    }
}
