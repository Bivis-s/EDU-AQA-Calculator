package by.bivis.calculator.calculator_factory;

import by.bivis.calculator.Calculator;
import by.bivis.calculator.IncorrectCalcException;

public class CalculatorFactory {
    /**
     * This Calculator has two modes:
     * <p>
     * CORRECT:
     * Addition - normal
     * Subtraction - normal
     * Multiplication - normal
     * Division - normal
     * <p>
     * INCORRECT:
     * Addition - normal but increased by 1
     * Subtraction - subtrahend minus minuend
     * Multiplication - 50% chance normal 50% chance normal but divided by 2
     * Division - throws exception
     *
     * @param type CalculatorSettingsType CORRECT or INCORRECT
     * @return new Calculator Object
     */
    public static Calculator createCalculator(CalculatorSettingsType type) {
        switch (type) {
            case CORRECT:
                return new Calculator(new CalculatorSettings(
                        (d1, d2) -> d1 + d2,
                        (d1, d2) -> d1 - d2,
                        (d1, d2) -> d1 * d2,
                        (d1, d2) -> d1 / d2));
            case INCORRECT:
                return new Calculator(new CalculatorSettings(
                        (d1, d2) -> d1 + d2 + 1,
                        (d1, d2) -> d2 - d1,
                        (d1, d2) -> {
                            if (Math.random() > 0.5) {
                                return d1 * d2;
                            } else {
                                return (d1 * d2) / 2;
                            }
                        },
                        (d1, d2) -> {
                            throw new IncorrectCalcException("НА-НА! You underestimate my brokenness");
                        }));
            default:
                throw new IllegalArgumentException();
        }
    }
}
