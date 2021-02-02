package by.bivis.calculator.calculator_factory.calculator_settings;

import by.bivis.calculator.CalcOperation;

public interface CalculatorSettings {
    CalcOperation<Double> getAddition();
    CalcOperation<Double> getSubtraction();
    CalcOperation<Double> getMultiplication();
    CalcOperation<Double> getDivision();
}
