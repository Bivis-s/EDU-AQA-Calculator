package by.bivis.calculator;

@FunctionalInterface
public interface CalcOperation<T> {
    T calc(T p1, T p2) throws CalculatorException;
}
