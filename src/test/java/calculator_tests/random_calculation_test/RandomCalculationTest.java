package calculator_tests.random_calculation_test;

import by.bivis.calculator.CalculatorException;
import by.bivis.calculator.calculator_factory.CalculatorFactory;
import calculator_tests.AbstractTest;
import calculator_tests.TestData;
import calculator_tests.test_tools.RandomRetryAnalyzer;
import calculator_tests.test_tools.UnstableTestListener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettingsTypes.RANDOM;

@Listeners(UnstableTestListener.class)

public class RandomCalculationTest extends AbstractTest {
    @BeforeClass(alwaysRun = true)
    public void createCalculator() {
        calculator = CalculatorFactory.createCalculator(RANDOM);
    }

    @AfterClass(alwaysRun = true)
    public void discardCalculator() {
        calculator = null;
    }

    @Test(groups = {"calculator", "positive", "random_type"},
            dataProvider = "correct addition data", dataProviderClass = TestData.class,
            retryAnalyzer = RandomRetryAnalyzer.class)
    public void randomTypeAdditionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.add(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "random_type"},
            dataProvider = "correct subtraction data", dataProviderClass = TestData.class,
            retryAnalyzer = RandomRetryAnalyzer.class)
    public void randomTypeSubtractionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.subtract(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "random_type"},
            dataProvider = "correct multiplication data", dataProviderClass = TestData.class,
            retryAnalyzer = RandomRetryAnalyzer.class)
    public void randomTypeMultiplicationCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.multiply(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "random_type"},
            dataProvider = "correct division data", dataProviderClass = TestData.class,
            retryAnalyzer = RandomRetryAnalyzer.class)
    public void randomTypeDivisionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.divide(p1, p2), expectedResult);
    }
}
