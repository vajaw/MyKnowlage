package io.trino.sql.visitor_pattern;

// MaxValueVisitor.java
public class MaxValueVisitor implements NodeVisitor<Integer> {
    @Override
    public Integer visitTreeNode(TreeNode node) {
        int max = Integer.MIN_VALUE;

        for (Node child : node.getChildren()) {
            int childValue = child.accept(this);
            max = Math.max(max, childValue);
        }

        return max;
    }

    @Override
    public Integer visitLeafNode(LeafNode node) {
        return node.getValue();
    }
}