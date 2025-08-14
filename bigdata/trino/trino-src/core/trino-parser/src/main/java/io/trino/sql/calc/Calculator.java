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

import io.trino.grammar.vaja.CalcBaseLexer;
import io.trino.grammar.vaja.CalcBaseParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
// Calculator.java

public class Calculator
{
    public double calculate(String expression)
    {
        // 词法分析和语法分析（使用CalcBaseLexer和CalcBaseParser）
        CharStream input = CharStreams.fromString(expression);
        CalcBaseLexer lexer = new CalcBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcBaseParser parser = new CalcBaseParser(tokens);

        // 构建AST
        CalcAstBuilder astBuilder = new CalcAstBuilder();
        CalcNode ast = astBuilder.visitProg(parser.prog());

        // 执行计算
        CalcExecutor executor = new CalcExecutor();
        return ast.accept(executor);
    }

    public static void main(String[] args)
    {
        String expression = "10 + ((5 * 2) / 3)";
        try {
            double result = new Calculator().calculate(expression);
            System.out.println(expression + " = " + result);
            // 1、将 g4 文件中 */ +- 位置对调，探索优先级:
            // case 1
            //      String expression = "10 + 5 * 2 / 3";
            //      输出: 10 + 5 * 2 / 3 = 10.0
            //      + > */
            // case 2
            //      String expression = "10 + (5 * 2) / 3";
            //      输出: 10 + (5 * 2) / 3 = 6.666666666666667
            //      () > + > */
            // case 3
            //      String expression = "10 + ((5 * 2) / 3)";
            //      输出: 10 + ((5 * 2) / 3) = 13.333333333333334
            //      () > + > */
        }
        catch (Exception e) {
            System.err.println("计算错误: " + e.getMessage());
        }
    }
}
