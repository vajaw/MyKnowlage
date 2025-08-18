package org.example.Annotation;

public class MyClass
{
    // 使用注解，并传递参数
    @MyAnnotation(value = "测试方法", version = 2)
    public void testMethod()
    {
        System.out.println("这是一个测试方法");
    }

    // 使用注解，使用默认值
    @MyAnnotation
    public void defaultMethod()
    {
        System.out.println("这是一个默认方法");
    }
}

