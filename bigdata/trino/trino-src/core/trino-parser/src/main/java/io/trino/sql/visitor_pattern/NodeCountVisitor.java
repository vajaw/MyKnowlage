package io.trino.sql.visitor_pattern;

// NodeCountVisitor.java
public class NodeCountVisitor implements NodeVisitor<Integer> {
    @Override
    public Integer visitTreeNode(TreeNode node) {
        int count = 1; // 当前节点

        for (Node child : node.getChildren()) {
            count += child.accept(this); // 递归计数子节点
        }

        System.out.println(node.getName()+" count " + count);
        return count;
    }

    @Override
    public Integer visitLeafNode(LeafNode node) {
        return 1; // 叶子节点只算自己
    }
}
