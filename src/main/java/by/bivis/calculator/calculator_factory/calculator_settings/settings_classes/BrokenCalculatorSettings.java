package by.bivis.calculator.calculator_factory.calculator_settings.settings_classes;

import by.bivis.calculator.CalcOperation;
import by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettings;

import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.BROKEN_ADDITION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.BROKEN_SUBTRACTION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.BROKEN_MULTIPLICATION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.BROKEN_DIVISION;

public class BrokenCalculatorSettings implements CalculatorSettings {
    @Override
    public CalcOperation<Double> getAddition() {
        return BROKEN_ADDITION;
    }

    @Override
    public CalcOperation<Double> getSubtraction() {
        return BROKEN_SUBTRACTION;
    }

    @Override
    public CalcOperation<Double> getMultiplication() {
        return BROKEN_MULTIPLICATION;
    }

    @Override
    public CalcOperation<Double> getDivision() {
        return BROKEN_DIVISION;
    }
}
