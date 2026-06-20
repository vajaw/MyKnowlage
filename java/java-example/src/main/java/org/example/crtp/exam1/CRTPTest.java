package org.example.crtp.exam1;

public class CRTPTest {
    public static void main(String[] args) {
        System.out.println("==知识点： CRTP 链式调用 协变 ===\n");

        // 演示1：基础链式调用
        System.out.println("1. 圆形协变链式调用:");
        Circle circle = new Circle(5.0)
                .setColor("Red")      // 返回 Circle
                .setRadius(10.0)      // Circle 特有方法
                .createCopy()         // 返回 Circle（协变）
                .setColor("Blue");    // 继续链式调用

        circle.printInfo();

        // 演示3：类型安全的协变
        System.out.println("\n2. 类型安全验证:");
        testTypeSafety();
    }

    public static void testTypeSafety() {
        Circle circle = new Circle(5);


        // 协变确保类型安全 - 编译期检查
        Circle circleCopy = circle.createCopy();      // ✅ 编译通过

        // 以下代码会在编译期报错：
        // Circle wrong = rect.createCopy();          // ❌ 编译错误

        System.out.println("类型安全验证通过！");

        // 协变链式调用
        circleCopy.setColor("Purple").setRadius(15).printInfo();
    }
}