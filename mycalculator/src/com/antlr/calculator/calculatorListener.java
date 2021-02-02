// Generated from /shuati/intellij/workspace/mycalculator/src/calculator.g4 by ANTLR 4.9.1
package com.antlr.calculator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(calculatorParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(calculatorParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterAssignValue(calculatorParser.AssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitAssignValue(calculatorParser.AssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoInput}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterNoInput(calculatorParser.NoInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoInput}
	 * labeled alternative in {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitNoInput(calculatorParser.NoInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ACosine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterACosine(calculatorParser.ACosineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ACosine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitACosine(calculatorParser.ACosineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulOrDiv}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulOrDiv(calculatorParser.MulOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulOrDiv}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulOrDiv(calculatorParser.MulOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atoms}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(calculatorParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atoms}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(calculatorParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTangent(calculatorParser.TangentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTangent(calculatorParser.TangentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSine(calculatorParser.SineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSine(calculatorParser.SineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedAtom}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(calculatorParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedAtom}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(calculatorParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSub(calculatorParser.AddOrSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSub(calculatorParser.AddOrSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterASine(calculatorParser.ASineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitASine(calculatorParser.ASineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogarithm(calculatorParser.LogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogarithm(calculatorParser.LogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATangent}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterATangent(calculatorParser.ATangentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATangent}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitATangent(calculatorParser.ATangentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPower(calculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPower(calculatorParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCosine(calculatorParser.CosineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCosine(calculatorParser.CosineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInteger(calculatorParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInteger(calculatorParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDouble(calculatorParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDouble(calculatorParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantPI(calculatorParser.ConstantPIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantPI(calculatorParser.ConstantPIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantE(calculatorParser.ConstantEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantE(calculatorParser.ConstantEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Scientific}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Scientific}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(calculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(calculatorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(calculatorParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(calculatorParser.BracketsContext ctx);
}