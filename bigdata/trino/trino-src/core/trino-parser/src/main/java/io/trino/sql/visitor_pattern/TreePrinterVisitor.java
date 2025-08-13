package io.trino.sql.visitor_pattern;

// TreePrinterVisitor.java
public class TreePrinterVisitor implements NodeVisitor<Void> {
    private final StringBuilder output = new StringBuilder();
    private int indent = 0;

    @Override
    public Void visitTreeNode(TreeNode node) {
        output.append("  ".repeat(indent))
                .append("Node: ")
                .append(node.getName())
                .append("\n");

        indent++;
        for (Node child : node.getChildren()) {
            child.accept(this);
        }
        indent--;

        return null;
    }

    @Override
    public Void visitLeafNode(LeafNode node) {
        output.append("  ".repeat(indent))
                .append("Leaf: ")
                .append(node.getValue())
                .append("\n");
        return null;
    }

    public String getOutput() {
        return output.toString();
    }
}
