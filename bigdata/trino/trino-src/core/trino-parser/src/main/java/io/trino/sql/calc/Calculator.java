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
        String expression = "10 + 2 * 2 * 2 * 2 * 2 * 2 / 2 ^ 2";
        String expression2 = "10 + 2 * 2 * 2 * 2 * 2 * 2 / 2 ^ 2 ^ 2";
        String expression3 = "10 + 2 * 2 * 2 * 2 * 2 * 2 / 2 ^ 2 ^ 2 ^ 2";
        try {
            Calculator calculator = new Calculator();
            double result = calculator.calculate(expression);
            double result2 = calculator.calculate(expression2);
            double result3 = calculator.calculate(expression3);
            System.out.println(expression + " = " + result);
            System.out.println(expression2 + " = " + result2);
            System.out.println(expression2 + " = " + result3);
            // print :
            // 10 + 2 * 2 * 2 * 2 * 2 * 2 / 2 ^ 2 = 26.0
            // 10 + 2 * 2 * 2 * 2 * 2 * 2 / 2 ^ 2 ^ 2 = 14.0
            // 10 + 2 * 2 * 2 * 2 * 2 * 2 / 2 ^ 2 ^ 2 = 10.25
        }
        catch (Exception e) {
            System.err.println("计算错误: " + e.getMessage());
        }
    }
}
