// Generated from io/trino/grammar/vaja/CalcBase.g4 by ANTLR 4.13.2
package io.trino.grammar.vaja;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcBaseParser}.
 */
public interface CalcBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcBaseParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalcBaseParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcBaseParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalcBaseParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CalcBaseParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CalcBaseParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalcBaseParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalcBaseParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalcBaseParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalcBaseParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(CalcBaseParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(CalcBaseParser.NumContext ctx);
}