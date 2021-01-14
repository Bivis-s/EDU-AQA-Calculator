package calculator_tests;

import by.bivis.calculator.Calculator;
import by.bivis.calculator.IncorrectCalcException;
import by.bivis.calculator.calculator_factory.CalculatorFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static by.bivis.calculator.calculator_factory.CalculatorSettingsType.CORRECT;

public class CorrectCalculatorTest {
    Calculator calculator;

    @BeforeMethod
    public void createCalculator() {
        calculator = CalculatorFactory.createCalculator(CORRECT);
    }

    @Test(dataProvider = "correct addition data", dataProviderClass = TestData.class)
    public void correctTypeAdditionCalculatorTest(double p1, double p2, double expectedResult)
            throws IncorrectCalcException {
        Assert.assertEquals(calculator.add(p1, p2), expectedResult);
    }

    @Test(dataProvider = "correct subtraction data", dataProviderClass = TestData.class)
    public void correctTypeSubtractionCalculatorTest(double p1, double p2, double expectedResult)
            throws IncorrectCalcException {
        Assert.assertEquals(calculator.subtract(p1, p2), expectedResult);
    }

    @Test(dataProvider = "correct multiplication data", dataProviderClass = TestData.class)
    public void correctTypeMultiplicationCalculatorTest(double p1, double p2, double expectedResult)
            throws IncorrectCalcException {
        Assert.assertEquals(calculator.multiply(p1, p2), expectedResult);
    }

    @Test(dataProvider = "correct division data", dataProviderClass = TestData.class)
    public void correctTypeDivisionCalculatorTest(double p1, double p2, double expectedResult)
            throws IncorrectCalcException {
        Assert.assertEquals(calculator.divide(p1, p2), expectedResult);
    }

    @AfterMethod
    public void discardCalculator() {
        calculator = null;
    }
}
