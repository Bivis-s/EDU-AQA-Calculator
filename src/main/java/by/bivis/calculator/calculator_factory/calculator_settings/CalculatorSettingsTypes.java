package by.bivis.calculator.calculator_factory.calculator_settings;

public enum CalculatorSettingsTypes {
    /**
     * Accurate calculator setting, calculator uses BigDecimal
     */
    ACCURATE,

    /**
     * Casual calculator setting, calculator uses standard + - * /
     */
    FLOAT_INACCURATE,

    /**
     * Random calculator setting, 25% returns accurate result 75% returns 0.0
     */
    RANDOM,

    /**
     * Unstable calculator setting, 50% returns accurate result 50% throws CalculatorException
     */
    UNSTABLE,

    /**
     * Broken calculator setting, each operation returns invalid result
     */
    BROKEN,

    /**
     * No such setting in CalculatorFactory
     */
    UNDEFINED
}
