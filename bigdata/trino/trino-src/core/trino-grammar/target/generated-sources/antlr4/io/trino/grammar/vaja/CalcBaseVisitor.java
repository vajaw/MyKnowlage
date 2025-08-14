// Generated from io/trino/grammar/vaja/CalcBase.g4 by ANTLR 4.13.2
package io.trino.grammar.vaja;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcBaseParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalcBaseParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CalcBaseParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CalcBaseParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CalcBaseParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(CalcBaseParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXP}
	 * labeled alternative in {@link CalcBaseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXP(CalcBaseParser.EXPContext ctx);
}