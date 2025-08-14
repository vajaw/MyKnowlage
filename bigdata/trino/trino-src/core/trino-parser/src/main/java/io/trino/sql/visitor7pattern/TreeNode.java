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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TreeNode.java - 代表普通树节点
public class TreeNode
        implements Node
{
    private final String name;
    private final List<Node> children;

    public TreeNode(String name, List<Node> children)
    {
        this.name = name;
        this.children = Collections.unmodifiableList(new ArrayList<>(children));
    }

    public String getName()
    {
        return name;
    }

    public List<Node> getChildren()
    {
        return children;
    }

    @Override
    public <R> R accept(NodeVisitor<R> visitor)
    {
        return visitor.visitTreeNode(this);
    }
}
