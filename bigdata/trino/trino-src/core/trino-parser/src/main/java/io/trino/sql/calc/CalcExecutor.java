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

public class CalcExecutor
        implements CalcVisitor<Double>
{
    @Override
    public Double visitNumber(NumberNode node)
    {
        return node.getValue();
    }

    @Override
    public Double visitBinaryOp(BinaryOpNode node)
    {
        double left = node.getLeft().accept(this);
        double right = node.getRight().accept(this);

        switch (node.getOperator()) {
            case ADD:
                return left + right;
            case SUB:
                return left - right;
            case MUL:
                return left * right;
            case DIV:
                if (right == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return left / right;
            case EXP:
                return Math.pow(left,right);
            default:
                throw new UnsupportedOperationException("Unknown operator");
        }
    }
}
