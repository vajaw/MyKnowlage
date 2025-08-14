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
package io.trino.sql.calc;

// 二元运算节点
public class BinaryOpNode
        implements CalcNode
{
    private final CalcNode left;
    private final CalcNode right;
    private final Operator operator;

    public BinaryOpNode(CalcNode left, Operator operator, CalcNode right)
    {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public CalcNode getLeft()
    {
        return left;
    }

    public CalcNode getRight()
    {
        return right;
    }

    public Operator getOperator()
    {
        return operator;
    }

    @Override
    public <T> T accept(CalcVisitor<T> visitor)
    {
        return visitor.visitBinaryOp(this);
    }

    public enum Operator
    {
        ADD,
        SUB,
        MUL,
        DIV
    }
}
