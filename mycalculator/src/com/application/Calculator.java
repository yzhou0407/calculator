package com.application;

import com.antlr.calculator.calculatorLexer;
import com.antlr.calculator.calculatorParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.jline.reader.*;
import org.jline.reader.impl.completer.ArgumentCompleter;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Calculator {

    String[] commandsList;

    public Calculator() {
        commandsList = new String[]{"help", "exit"};
    }

    private Double parseAndCalculate(String line) {

        calculatorLexer lexer = new calculatorLexer(CharStreams.fromString(line));

        TokenStream tokens = new CommonTokenStream(lexer);

        calculatorParser parser = new calculatorParser(tokens);

        // Add my own parser error listener
        parser.removeErrorListeners();
        CalculatorSyntaxErrorListener errorListener = new CalculatorSyntaxErrorListener();
        parser.addErrorListener(errorListener);

        calculatorParser.EquationContext equationContext = parser.equation();

        // Skip visit root node when there's already syntax error.
        if (errorListener.hasError) {
            return null;
        }

        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();

        return calculatorVisitor.visit(equationContext);

    }

    private void printWelcomeMessage() {

        System.out.println("Welcome to my ANTLR4 calculator. Type \"help\" then hit ENTER to get help.");

    }

    private void printHelp() {
        System.out.println("help        - Show help");
        System.out.println("expression  - Calculate Expression. ex. 1+5");
        System.out.println("exit        - Exit the calculator");

    }

    private void runCalculator() {

        try {

            printWelcomeMessage();

            Terminal terminal = TerminalBuilder.builder()
                    .system(true)
                    .build();

            List<Completer> completerList = new LinkedList<>();
            completerList.add(new StringsCompleter(commandsList));

            LineReader reader = LineReaderBuilder.builder()
                    .terminal(terminal)
                    .completer(new ArgumentCompleter(completerList))
                    .build();
            reader.unsetOpt(LineReader.Option.BRACKETED_PASTE);

            String line;
            String prompt = "Calculator>";
            line = reader.readLine(prompt);

            while (line != null) {

                if ("help".equals(line)) {
                    printHelp();
                } else if ("exit".equals(line)) {
                    System.out.println("Exiting application");
                    return;
                } else {
                    printResult(prompt, parseAndCalculate(line));
                }
                line = reader.readLine(prompt);
            }

        } catch (IOException ex) {
            System.out.println("Failed at getting terminal instance.");
        }

    }

    private void printResult(String prompt, Double result) {

        if (result == null) {
            System.out.println(prompt);
            return;
        }

        if (Math.ceil(result.doubleValue()) == Math.floor(result.doubleValue())){
            System.out.println(prompt + result.intValue());
        } else {
            System.out.println(prompt + result);
        }

        return;
    }

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        myCalculator.runCalculator();

    }
}
