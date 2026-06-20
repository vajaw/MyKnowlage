package org.example.crtp.exam1;

public class Circle extends Shape<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // 协变：重写方法返回 Circle 而不是 Shape
    @Override
    public Circle createCopy() {
        Circle copy = new Circle(this.radius);
        copy.color = this.color;
        return copy;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // 子类特有方法 - 协变链式调用
    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public void printInfo() {
        System.out.println("Circle [radius=" + radius + ", color=" + color + ", area=" + area() + "]");
    }
}
