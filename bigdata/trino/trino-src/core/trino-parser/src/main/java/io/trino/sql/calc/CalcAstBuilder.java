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

import io.trino.grammar.vaja.CalcBaseBaseVisitor;
import io.trino.grammar.vaja.CalcBaseParser;

public class CalcAstBuilder
        extends CalcBaseBaseVisitor<CalcNode>
{
    @Override
    public CalcNode visitProg(CalcBaseParser.ProgContext ctx)
    {
        // 默认只处理第一个表达式
        return ctx.expr(0).accept(this);
    }

    @Override
    public CalcNode visitNum(CalcBaseParser.NumContext ctx)
    {
        double value = Double.parseDouble(ctx.NUMBER().getText());
        return new NumberNode(value);
    }

    @Override
    public CalcNode visitParens(CalcBaseParser.ParensContext ctx)
    {
        return ctx.expr().accept(this);
    }

    @Override
    public CalcNode visitMulDiv(CalcBaseParser.MulDivContext ctx)
    {
        CalcNode left = ctx.expr(0).accept(this);
        CalcNode right = ctx.expr(1).accept(this);

        BinaryOpNode.Operator op =
                ctx.op.getType() == CalcBaseParser.MUL
                        ? BinaryOpNode.Operator.MUL
                        : BinaryOpNode.Operator.DIV;

        return new BinaryOpNode(left, op, right);
    }

    @Override
    public CalcNode visitAddSub(CalcBaseParser.AddSubContext ctx)
    {
        CalcNode left = ctx.expr(0).accept(this);
        CalcNode right = ctx.expr(1).accept(this);

        BinaryOpNode.Operator op =
                ctx.op.getType() == CalcBaseParser.ADD
                        ? BinaryOpNode.Operator.ADD
                        : BinaryOpNode.Operator.SUB;

        return new BinaryOpNode(left, op, right);
    }

    @Override
    public CalcNode visitEXP(CalcBaseParser.EXPContext ctx)
    {
        CalcNode left = ctx.expr(0).accept(this);
        CalcNode right = ctx.expr(1).accept(this);
        BinaryOpNode.Operator op = BinaryOpNode.Operator.EXP;
        return new BinaryOpNode(left, op, right);
    }
}
