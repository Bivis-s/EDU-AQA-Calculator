package by.bivis.calculator.calculator_factory.calculator_settings.settings_classes;

import by.bivis.calculator.CalcOperation;
import by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettings;

import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.CASUAL_ADDITION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.CASUAL_SUBTRACTION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.CASUAL_MULTIPLICATION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.CASUAL_DIVISION;

public class CasualCalculatorSettings implements CalculatorSettings {
    @Override
    public CalcOperation<Double> getAddition() {
        return CASUAL_ADDITION;
    }

    @Override
    public CalcOperation<Double> getSubtraction() {
        return CASUAL_SUBTRACTION;
    }

    @Override
    public CalcOperation<Double> getMultiplication() {
        return CASUAL_MULTIPLICATION;
    }

    @Override
    public CalcOperation<Double> getDivision() {
        return CASUAL_DIVISION;
    }
}
