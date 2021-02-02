package by.bivis.calculator.calculator_factory.calculator_settings.settings_classes;

import by.bivis.calculator.CalcOperation;
import by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettings;

import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.UNSTABLE_ADDITION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.UNSTABLE_SUBTRACTION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.UNSTABLE_MULTIPLICATION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.UNSTABLE_DIVISION;

public class UnstableCalculatorSettings implements CalculatorSettings {
    @Override
    public CalcOperation<Double> getAddition() {
        return UNSTABLE_ADDITION;
    }

    @Override
    public CalcOperation<Double> getSubtraction() {
        return UNSTABLE_SUBTRACTION;
    }

    @Override
    public CalcOperation<Double> getMultiplication() {
        return UNSTABLE_MULTIPLICATION;
    }

    @Override
    public CalcOperation<Double> getDivision() {
        return UNSTABLE_DIVISION;
    }
}
