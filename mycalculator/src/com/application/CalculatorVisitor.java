package com.application;

import com.antlr.calculator.*;

import java.util.Map;
import java.util.HashMap;

public class CalculatorVisitor extends calculatorBaseVisitor<Double> {

    // variables store all the accessed variables name/value pair.
    Map<String, Double> variables;

    public CalculatorVisitor(){
        variables = new HashMap<String, Double>();
    }

    @Override
    public Double visitPrintExpression(calculatorParser.PrintExpressionContext ctx) {
        return visit(ctx.expression()); // Visit expression to calculate the value.
    }

    @Override
    public Double visitAssignValue(calculatorParser.AssignValueContext ctx) {

        String id = ctx.VARIABLE().getText();   // Get variable's name
        double value = visit(ctx.expression()); // visit expression to calculate the value.
        variables.put(id, value);               // Add variable to the variable hashmap.
        return value;
    }

    @Override
    public Double visitACosine(calculatorParser.ACosineContext ctx) {
        double value = visit(ctx.expression());
        return Math.acos(value);
    }

    @Override
    public Double visitMulOrDiv(calculatorParser.MulOrDivContext ctx) {

        double left = visit(ctx.expression(0));  // visit and get the value of left expression
        double right = visit(ctx.expression(1)); // visit and get the value of right expression
        if ( ctx.op.getType() == calculatorParser.TIMES ) {
            return left * right;
        } else {
            return left / right;
        }

    }

    @Override
    public Double visitTangent(calculatorParser.TangentContext ctx) {
        double value = visit(ctx.expression());
        return Math.tan(value);
    }

    @Override
    public Double visitSine(calculatorParser.SineContext ctx) {
        double value = visit(ctx.expression());
        return Math.sin(value);
    }

    @Override
    public Double visitSignedAtom(calculatorParser.SignedAtomContext ctx) {

        // First, get the value of atom by visiting it.
        double value = visit(ctx.atom());
        // Return the signed value based on the operation type.
        if ( ctx.op.getType() == calculatorParser.PLUS ) {
            return value;
        } else {
            return (-1) * value;
        }
    }

    @Override
    public Double visitAddOrSub(calculatorParser.AddOrSubContext ctx) {
        double left = visit(ctx.expression(0));  // visit and get the value of left expression
        double right = visit(ctx.expression(1)); // visit and get the value of right expression
        if ( ctx.op.getType() == calculatorParser.PLUS ) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Double visitNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx) {
        // Natural logarithm use e as base.
        return Math.log(visit(ctx.expression()));
    }

    @Override
    public Double visitASine(calculatorParser.ASineContext ctx) {
        double value = visit(ctx.expression());
        return Math.asin(value);
    }

    @Override
    public Double visitLogarithm(calculatorParser.LogarithmContext ctx) {
        double base = visit(ctx.expression(0));
        double value = visit(ctx.expression(1));

        return Math.log(value)/Math.log(base);
    }

    @Override
    public Double visitSquareRoot(calculatorParser.SquareRootContext ctx) {
        // Square root-> 平方根
        double value = visit(ctx.expression());
        return Math.sqrt(value);
    }

    @Override
    public Double visitATangent(calculatorParser.ATangentContext ctx) {
        double value = visit(ctx.expression());
        return Math.atan(value);
    }

    @Override
    public Double visitPower(calculatorParser.PowerContext ctx) {
        double left = visit(ctx.expression(0));  // Visit and get value of left expression
        double right = visit(ctx.expression(1)); // Visit and get value of right expression
        return Math.pow(left, right);
    }

    @Override
    public Double visitCosine(calculatorParser.CosineContext ctx) {
        double value = visit(ctx.expression());
        return Math.cos(value);
    }

    @Override
    public Double visitInteger(calculatorParser.IntegerContext ctx) {
        return Double.valueOf(ctx.INT().getText());
    }

    @Override
    public Double visitDouble(calculatorParser.DoubleContext ctx) {
        return Double.valueOf(ctx.DOUBLE().getText());
    }

    @Override
    public Double visitConstantPI(calculatorParser.ConstantPIContext ctx) {
        return Double.valueOf(Math.PI);
    }

    @Override
    public Double visitConstantE(calculatorParser.ConstantEContext ctx) {
        return Double.valueOf(Math.E);
    }

    @Override
    public Double visitScientific(calculatorParser.ScientificContext ctx) {
        // "9.78313E+2" this is how Scientific number look like
        // need to convert to a normal double format 978.313
        return Double.parseDouble(ctx.SCIENTIFIC_NUMBER().getText());
    }

    @Override
    public Double visitVariable(calculatorParser.VariableContext ctx) {

        String id = ctx.VARIABLE().getText();
        // When variable is visited, it could be during assignment, or just directly us the
        // variable.
        if ( variables.containsKey(id) ) {
            return variables.get(id);
        } else {
            return 0.0;
        }

    }

    @Override
    public Double visitBrackets(calculatorParser.BracketsContext ctx) {
        // When brackets are visited, just visit and return the expression's value.
        // (expression)
        return visit(ctx.expression());
    }
}
