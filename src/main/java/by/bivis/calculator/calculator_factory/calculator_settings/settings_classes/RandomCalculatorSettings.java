package by.bivis.calculator.calculator_factory.calculator_settings.settings_classes;

import by.bivis.calculator.CalcOperation;
import by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettings;

import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.RANDOM_ADDITION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.RANDOM_SUBTRACTION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.RANDOM_MULTIPLICATION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.RANDOM_DIVISION;

public class RandomCalculatorSettings implements CalculatorSettings {
    @Override
    public CalcOperation<Double> getAddition() {
        return RANDOM_ADDITION;
    }

    @Override
    public CalcOperation<Double> getSubtraction() {
        return RANDOM_SUBTRACTION;
    }

    @Override
    public CalcOperation<Double> getMultiplication() {
        return RANDOM_MULTIPLICATION;
    }

    @Override
    public CalcOperation<Double> getDivision() {
        return RANDOM_DIVISION;
    }
}
