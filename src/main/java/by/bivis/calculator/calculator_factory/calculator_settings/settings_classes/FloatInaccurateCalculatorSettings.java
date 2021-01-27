package by.bivis.calculator.calculator_factory.calculator_settings.settings_classes;

import by.bivis.calculator.CalcOperation;
import by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettings;

import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.FLOAT_INACCURATE_ADDITION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.FLOAT_INACCURATE_SUBTRACTION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.FLOAT_INACCURATE_MULTIPLICATION;
import static by.bivis.calculator.calculator_factory.calculator_settings.settings_data.SettingsData.FLOAT_INACCURATE_DIVISION;

public class FloatInaccurateCalculatorSettings implements CalculatorSettings {
    @Override
    public CalcOperation<Double> getAddition() {
        return FLOAT_INACCURATE_ADDITION;
    }

    @Override
    public CalcOperation<Double> getSubtraction() {
        return FLOAT_INACCURATE_SUBTRACTION;
    }

    @Override
    public CalcOperation<Double> getMultiplication() {
        return FLOAT_INACCURATE_MULTIPLICATION;
    }

    @Override
    public CalcOperation<Double> getDivision() {
        return FLOAT_INACCURATE_DIVISION;
    }
}
