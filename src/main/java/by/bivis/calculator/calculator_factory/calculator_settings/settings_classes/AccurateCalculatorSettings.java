package by.bivis.calculator.calculator_factory.calculator_settings.settings_classes;

import by.bivis.calculator.CalcOperation;
import by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettings;

import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.ACCURATE_ADDITION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.ACCURATE_SUBTRACTION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.ACCURATE_MULTIPLICATION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.ACCURATE_DIVISION;

public class AccurateCalculatorSettings implements CalculatorSettings {
    public CalcOperation<Double> getAddition() {
        return ACCURATE_ADDITION;
    }

    public CalcOperation<Double> getSubtraction() {
        return ACCURATE_SUBTRACTION;
    }

    public CalcOperation<Double> getMultiplication() {
        return ACCURATE_MULTIPLICATION;
    }

    public CalcOperation<Double> getDivision() {
        return ACCURATE_DIVISION;
    }
}
