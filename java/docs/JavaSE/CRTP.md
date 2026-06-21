# 什么是 CRTP？
CRTP（Curiously Recurring Template Pattern）中文叫"奇异递归模板模式"，是一种让父类知道子类类型的技术。

# 基本语法
```java
// 父类使用子类作为泛型参数
public abstract class Base<T extends Base<T>> {
    public abstract T getInstance();
}

// 子类在继承时传入自身类型
public class Child extends Base<Child> {
    @Override
    public Child getInstance() {
        return new Child();
    }
}
```

# 详细示例分析
## 示例1：基础 CRTP
```java
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

```
## 测试代码
```java
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
```

# 在 Doris TreeNode 中的应用 
```java
// Doris 中的实际代码
public interface TreeNode<NODE_TYPE extends TreeNode<NODE_TYPE>> {
    
    // 这些方法都返回具体的子类类型
    NODE_TYPE withChildren(List<NODE_TYPE> children);
    
    default NODE_TYPE withChildren(Function<NODE_TYPE, NODE_TYPE> rewriter) {
        return withChildren((child, index) -> rewriter.apply(child));
    }
    
    default NODE_TYPE rewriteDownShortCircuit(Function<NODE_TYPE, NODE_TYPE> rewriteFunction) {
        NODE_TYPE currentNode = rewriteFunction.apply((NODE_TYPE) this);
        // ... 处理逻辑
        return currentNode;  // 返回具体子类类型
    }
}

// 具体实现
class AddExpression implements TreeNode<AddExpression> {
    private final Expression left;
    private final Expression right;
    
    @Override
    public AddExpression withChildren(List<AddExpression> children) {
        // 返回 AddExpression 而不是 TreeNode
        return new AddExpression(children.get(0), children.get(1));
    }
    
    // 特有方法
    public AddExpression swapOperands() {
        return new AddExpression(right, left);
    }
}
```

# CRTP 的核心优势
## 1. 编译期类型安全
```java
    // 传统方式
    Expression expr = new AddExpression(left, right);
    Expression result = expr.withChildren(newChildren);
    // 需要强制转换才能调用 AddExpression 特有方法
    AddExpression addResult = (AddExpression) result;
    addResult.swapOperands();
    
    // CRTP 方式
    AddExpression expr = new AddExpression(left, right);
    AddExpression result = expr.withChildren(newChildren);
    // 不需要强制转换！
    result.swapOperands();
```

## 2. 流畅的链式调用
 
```
    // 传统方式 - 链式调用困难
    Expression result = expr.method1().method2(); // 只能调用 Expression 的方法
    
    // CRTP 方式 - 完美的链式调用
    AddExpression result = expr
    .method1()  // 返回 AddExpression
    .method2()  // 返回 AddExpression  
    .swapOperands();  // AddExpression 特有方法
```
## 3. 方法返回类型协变
```java
    // 父类方法返回基类类型
    public TreeNode withChildren(List children)
    
    // 子类重写时可以返回更具体的类型
    @Override
    public AddExpression withChildren(List children)

```