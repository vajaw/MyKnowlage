package io.trino.sql.visitor_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Node.java - 所有树节点的基类
public interface Node {
    // 接受访问者的方法
    <R> R accept(NodeVisitor<R> visitor);
}

// TreeNode.java - 代表普通树节点
class TreeNode implements Node {
    private final String name;
    private final List<Node> children;

    public TreeNode(String name, List<Node> children) {
        this.name = name;
        this.children = Collections.unmodifiableList(new ArrayList<>(children));
    }

    public String getName() {
        return name;
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public <R> R accept(NodeVisitor<R> visitor) {
        return visitor.visitTreeNode(this);
    }
}

// LeafNode.java - 代表叶子节点
class LeafNode implements Node {
    private final int value;

    public LeafNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <R> R accept(NodeVisitor<R> visitor) {
        return visitor.visitLeafNode(this);
    }
}
