package by.bivis.calculator.calculator_factory;

import by.bivis.calculator.IncorrectCalcException;

@FunctionalInterface
public interface CalcOperation<T> {
    T calc(T p1, T p2) throws IncorrectCalcException;
}
