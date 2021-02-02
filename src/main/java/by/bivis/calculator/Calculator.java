package by.bivis.calculator;

import by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettings;

public class Calculator {
    private final CalculatorSettings calculatorSettings;
    private boolean state;

    public Calculator(CalculatorSettings calculatorSettings) {
        this.calculatorSettings = calculatorSettings;
        state = true;
    }

    public CalculatorSettings getCalculatorSettings() {
        return calculatorSettings;
    }

    public boolean activate() {
        if (!state) {
            state = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean deactivate() {
        if (state) {
            state = false;
            return true;
        } else {
            return false;
        }
    }

    private CalculatorException createCalculatorDeactivatedException() throws CalculatorException {
        throw new CalculatorException("Calculator is deactivated");
    }

    public double add(double a, double b) throws CalculatorException {
        if (state) {
            return calculatorSettings.getAddition().calc(a, b);
        } else {
            throw createCalculatorDeactivatedException();
        }
    }

    public double subtract(double a, double b) throws CalculatorException {
        if (state) {
            return calculatorSettings.getSubtraction().calc(a, b);
        } else {
            throw createCalculatorDeactivatedException();
        }
    }

    public double multiply(double a, double b) throws CalculatorException {
        if (state) {
            return calculatorSettings.getMultiplication().calc(a, b);
        } else {
            throw createCalculatorDeactivatedException();
        }
    }

    public double divide(double a, double b) throws CalculatorException {
        if (state) {
            if (b != 0) {
                return calculatorSettings.getDivision().calc(a, b);
            } else {
                throw new CalculatorException("Tried dividing by zero");
            }
        } else {
            throw createCalculatorDeactivatedException();
        }
    }
}
