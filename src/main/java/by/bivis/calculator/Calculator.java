package by.bivis.calculator;

import by.bivis.calculator.calculator_factory.CalculatorSettings;

public class Calculator {
    private final CalculatorSettings calculatorSettings;

    public Calculator(CalculatorSettings calculatorSettings) {
        this.calculatorSettings = calculatorSettings;
    }

    public double add(double a, double b) throws IncorrectCalcException {
        return calculatorSettings.getAddition().calc(a, b);
    }

    public double subtract(double a, double b) throws IncorrectCalcException {
        return calculatorSettings.getSubtraction().calc(a, b);
    }

    public double multiply(double a, double b) throws IncorrectCalcException {
        return calculatorSettings.getMultiplication().calc(a, b);
    }

    public double divide(double a, double b) throws IncorrectCalcException {
        return calculatorSettings.getDivision().calc(a, b);
    }
}
