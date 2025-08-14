/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.trino.sql.visitor7pattern;

// TreePrinterVisitor.java
public class TreePrinterVisitor
        implements NodeVisitor<Void>
{
    private final StringBuilder output = new StringBuilder();
    private int indent;

    public TreePrinterVisitor()
    {
        indent = 0;
    }

    @Override
    public Void visitTreeNode(TreeNode node)
    {
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
    public Void visitLeafNode(LeafNode node)
    {
        output.append("  ".repeat(indent))
                .append("Leaf: ")
                .append(node.getValue())
                .append("\n");
        return null;
    }

    public String getOutput()
    {
        return output.toString();
    }
}
