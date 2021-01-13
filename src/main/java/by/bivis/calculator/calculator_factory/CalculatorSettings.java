package by.bivis.calculator.calculator_factory;

public class CalculatorSettings {
    private final CalcOperation<Double> addition;
    private final CalcOperation<Double> subtraction;
    private final CalcOperation<Double> multiplication;
    private final CalcOperation<Double> division;

    protected CalculatorSettings(CalcOperation<Double> addition, CalcOperation<Double> subtraction,
                              CalcOperation<Double> multiplication, CalcOperation<Double> division) {
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }

    public CalcOperation<Double> getAddition() {
        return addition;
    }

    public CalcOperation<Double> getSubtraction() {
        return subtraction;
    }

    public CalcOperation<Double> getMultiplication() {
        return multiplication;
    }

    public CalcOperation<Double> getDivision() {
        return division;
    }
}
