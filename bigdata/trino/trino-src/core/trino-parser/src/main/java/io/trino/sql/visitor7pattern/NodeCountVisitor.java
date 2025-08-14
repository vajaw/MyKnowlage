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

// NodeCountVisitor.java
public class NodeCountVisitor
        implements NodeVisitor<Integer>
{
    @Override
    public Integer visitTreeNode(TreeNode node)
    {
        int count = 1; // 当前节点

        for (Node child : node.getChildren()) {
            count += child.accept(this); // 递归计数子节点
        }

        System.out.println(node.getName() + " count " + count);
        return count;
    }

    @Override
    public Integer visitLeafNode(LeafNode node)
    {
        return 1; // 叶子节点只算自己
    }
}
