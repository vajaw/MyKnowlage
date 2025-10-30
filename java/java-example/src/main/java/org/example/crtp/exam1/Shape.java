package org.example.crtp.exam1;

// 基类 - 使用递归泛型
public abstract class Shape<T extends Shape<T>> {
    protected String color;

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    // 协变方法：返回具体子类类型
    public T setColor(String color) {
        this.color = color;
        return self();
    }

    public abstract double area();

    // 协变工厂方法
    public abstract T createCopy();
}