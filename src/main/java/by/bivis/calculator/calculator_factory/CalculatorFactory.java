package by.bivis.calculator.calculator_factory;

import by.bivis.calculator.Calculator;
import by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettingsTypes;
import by.bivis.calculator.calculator_factory.calculator_settings.settings_classes.*;

public class CalculatorFactory {
    /**
     * Returns the calculator with one of the settings if there is no such setting, throws an Exception
     *
     * @param type CalculatorSettingsType
     * @return new Calculator Object
     */
    public static Calculator createCalculator(CalculatorSettingsTypes type) {
        switch (type) {
            case ACCURATE:
                return new Calculator(new AccurateCalculatorSettings());
            case FLOAT_INACCURATE:
                return new Calculator(new FloatInaccurateCalculatorSettings());
            case RANDOM:
                return new Calculator(new RandomCalculatorSettings());
            case UNSTABLE:
                return new Calculator(new UnstableCalculatorSettings());
            case BROKEN:
                return new Calculator(new BrokenCalculatorSettings());
            default:
                throw new IllegalArgumentException();
        }
    }
}
