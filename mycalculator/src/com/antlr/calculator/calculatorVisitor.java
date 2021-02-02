// Generated from /shuati/intellij/workspace/mycalculator/src/calculator.g4 by ANTLR 4.9.1
package com.antlr.calculator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(calculatorParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignValue(calculatorParser.AssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoInput}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoInput(calculatorParser.NoInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ACosine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitACosine(calculatorParser.ACosineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulOrDiv}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOrDiv(calculatorParser.MulOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atoms}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtoms(calculatorParser.AtomsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTangent(calculatorParser.TangentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSine(calculatorParser.SineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedAtom}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(calculatorParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSub(calculatorParser.AddOrSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASine(calculatorParser.ASineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogarithm(calculatorParser.LogarithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATangent}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATangent(calculatorParser.ATangentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(calculatorParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosine(calculatorParser.CosineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(calculatorParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(calculatorParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantPI(calculatorParser.ConstantPIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantE(calculatorParser.ConstantEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Scientific}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(calculatorParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(calculatorParser.BracketsContext ctx);
}