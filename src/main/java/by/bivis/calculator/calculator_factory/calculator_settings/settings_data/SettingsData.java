package by.bivis.calculator.calculator_factory.calculator_settings.settings_data;

import by.bivis.calculator.CalcOperation;
import by.bivis.calculator.CalculatorException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SettingsData {
    /**
     * Turns Double object into BigDecimal object
     *
     * @param d Double object
     * @return BigDecimal object
     */
    private static BigDecimal getBigDecimal(Double d) {
        return new BigDecimal(d.toString());
    }

    private static double getAccurateAddition(double d1, double d2) {
        return getBigDecimal(d1).add(getBigDecimal(d2)).doubleValue();
    }

    private static double getAccurateSubtraction(double d1, double d2) {
        return getBigDecimal(d1).subtract(getBigDecimal(d2)).doubleValue();
    }

    private static double getAccurateMultiplication(double d1, double d2) {
        return getBigDecimal(d1).multiply(getBigDecimal(d2)).doubleValue();
    }

    private static double getAccurateDivision(double d1, double d2) {
        return getBigDecimal(d1).divide(getBigDecimal(d2), RoundingMode.CEILING).doubleValue();
    }

    // Accurate Addition CalcOperation usingBigDecimal
    public static final CalcOperation<Double> ACCURATE_ADDITION =
            SettingsData::getAccurateAddition;
    // Accurate Subtraction CalcOperation using BigDecimal
    public static final CalcOperation<Double> ACCURATE_SUBTRACTION =
            SettingsData::getAccurateSubtraction;
    // Accurate Multiplication CalcOperation usingBigDecimal
    public static final CalcOperation<Double> ACCURATE_MULTIPLICATION =
            SettingsData::getAccurateMultiplication;
    // Accurate Division CalcOperation using BigDecimal
    public static final CalcOperation<Double> ACCURATE_DIVISION =
            SettingsData::getAccurateDivision;

    // Casual Addition CalcOperation
    public static final CalcOperation<Double> CASUAL_ADDITION =
            (d1, d2) -> d1 + d2;
    // Casual Subtraction CalcOperation
    public static final CalcOperation<Double> CASUAL_SUBTRACTION =
            (d1, d2) -> d1 - d2;
    // Casual Multiplication CalcOperation
    public static final CalcOperation<Double> CASUAL_MULTIPLICATION =
            (d1, d2) -> d1 * d2;
    // Casual Division CalcOperation
    public static final CalcOperation<Double> CASUAL_DIVISION =
            (d1, d2) -> d1 / d2;

    // Random Addition CalcOperation returns Accurate result (25%) or 0.0 (75%)
    public static final CalcOperation<Double> RANDOM_ADDITION =
            (d1, d2) -> {
                if (Math.random() > 0.75) {
                    return getAccurateAddition(d1, d2);
                } else {
                    return 0.0;
                }
            };
    // Random Subtraction CalcOperation returns Accurate result (25%) or 0.0 (75%)
    public static final CalcOperation<Double> RANDOM_SUBTRACTION =
            (d1, d2) -> {
                if (Math.random() > 0.75) {
                    return getAccurateSubtraction(d1, d2);
                } else {
                    return 0.0;
                }
            };
    // Random Multiplication CalcOperation returns Accurate result (25%) or 0.0 (75%)
    public static final CalcOperation<Double> RANDOM_MULTIPLICATION =
            (d1, d2) -> {
                if (Math.random() > 0.75) {
                    return getAccurateMultiplication(d1, d2);
                } else {
                    return 0.0;
                }
            };
    // Random Division CalcOperation returns Accurate result (25%) or 0.0 (75%)
    public static final CalcOperation<Double> RANDOM_DIVISION =
            (d1, d2) -> {
                if (Math.random() > 0.75) {
                    return getAccurateDivision(d1, d2);
                } else {
                    return 0.0;
                }
            };

    // Random Addition CalcOperation returns Accurate result (50%) or throws CalculatorException (50%)
    public static final CalcOperation<Double> UNSTABLE_ADDITION =
            (d1, d2) -> {
                if (Math.random() > 0.5) {
                    return getAccurateAddition(d1, d2);
                } else {
                    throw new CalculatorException("You underestimate my brokenness");
                }
            };
    // Random Subtraction CalcOperation returns Accurate result (50%) or throws CalculatorException (50%)
    public static final CalcOperation<Double> UNSTABLE_SUBTRACTION =
            (d1, d2) -> {
                if (Math.random() > 0.5) {
                    return getAccurateSubtraction(d1, d2);
                } else {
                    throw new CalculatorException("You underestimate my brokenness");
                }
            };
    // Random Multiplication CalcOperation returns Accurate result (50%) or throws CalculatorException (50%)
    public static final CalcOperation<Double> UNSTABLE_MULTIPLICATION =
            (d1, d2) -> {
                if (Math.random() > 0.5) {
                    return getAccurateMultiplication(d1, d2);
                } else {
                    throw new CalculatorException("You underestimate my brokenness");
                }
            };
    // Unstable Division CalcOperation returns Accurate result (50%) or throws CalculatorException (50%)
    public static final CalcOperation<Double> UNSTABLE_DIVISION =
            (d1, d2) -> {
                if (Math.random() > 0.5) {
                    return getAccurateDivision(d1, d2);
                } else {
                    throw new CalculatorException("You underestimate my brokenness");
                }
            };

    // Broken Addition CalcOperation increased by 1
    public static final CalcOperation<Double> BROKEN_ADDITION =
            (d1, d2) -> d1 + d2 + 1;
    // Broken Subtraction CalcOperation with swapped subtrahend and minuend
    public static final CalcOperation<Double> BROKEN_SUBTRACTION =
            (d1, d2) -> d2 - d1;
    // Broken Multiplication CalcOperation with answer divided by 3
    public static final CalcOperation<Double> BROKEN_MULTIPLICATION =
            (d1, d2) -> d1 * d2 / 3;
    // Broken Division CalcOperation with squared dividend
    public static final CalcOperation<Double> BROKEN_DIVISION =
            (d1, d2) -> d1 * d1 / d2;
}
