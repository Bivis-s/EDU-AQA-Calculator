package calculator_tests;

import by.bivis.calculator.Calculator;
import by.bivis.calculator.calculator_factory.CalculatorFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static by.bivis.calculator.calculator_factory.CalculatorSettingsType.*;

public class CalculatorFactoryTest {
    @Test(description = "Create Calculator using correct Type parameter")
    public void createCorrectCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(CORRECT).getClass(), Calculator.class);
    }

    @Test(description = "Create Calculator using incorrect Type parameter")
    public void createIncorrectCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(INCORRECT).getClass(), Calculator.class);
    }

    @Test(description = "Create Calculator using undefined Type parameter",
            expectedExceptions = IllegalArgumentException.class)
    public void createInvalidTypeCalculatorTest() {
        CalculatorFactory.createCalculator(UNDEFINED);
    }
}
