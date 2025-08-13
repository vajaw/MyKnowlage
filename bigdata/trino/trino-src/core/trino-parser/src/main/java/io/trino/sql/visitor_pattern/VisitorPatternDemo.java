package io.trino.sql.visitor_pattern;

import java.util.List;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        // 构建一个示例树
        Node tree = buildSampleTree();

        // 1. 打印树结构
        TreePrinterVisitor printer = new TreePrinterVisitor();
        tree.accept(printer);
        System.out.println("Tree structure:");
        System.out.println(printer.getOutput());

        // 2. 计算节点总数
        NodeCountVisitor counter = new NodeCountVisitor();
        int totalNodes = tree.accept(counter);
        System.out.println("Total nodes: " + totalNodes);

        // 3. 查找最大值
        MaxValueVisitor maxFinder = new MaxValueVisitor();
        int maxValue = tree.accept(maxFinder);
        System.out.println("Maximum leaf value: " + maxValue);
    }

    private static Node buildSampleTree() {
        // 构建一个示例树：
        //      Root
        //     / | \
        //    A  B  C
        //   / \    |
        //  D(5)E(8)F(3)

        final TreeNode treeNode = new TreeNode("Root", List.of(
                new TreeNode("A", List.of(
                        new LeafNode(5),
                        new LeafNode(8)
                )),
                new TreeNode("B", List.of()),
                new TreeNode("C", List.of(
                        new LeafNode(3)
                ))
        ));
        return treeNode;
    }
}
