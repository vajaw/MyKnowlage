package io.trino.sql.visitor_pattern;

// NodeVisitor.java - 访问者接口
public interface NodeVisitor<R> {
    R visitTreeNode(TreeNode node);
    R visitLeafNode(LeafNode node);
}

