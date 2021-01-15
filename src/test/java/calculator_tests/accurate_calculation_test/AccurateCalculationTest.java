package calculator_tests.accurate_calculation_test;

import by.bivis.calculator.CalculatorException;
import by.bivis.calculator.calculator_factory.CalculatorFactory;
import calculator_tests.AbstractTest;
import calculator_tests.TestData;
import calculator_tests.test_tools.CalculatorDeactivatedRetryAnalyzer;
import calculator_tests.test_tools.UnstableTestListener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettingsTypes.ACCURATE;

@Listeners(UnstableTestListener.class)

public class AccurateCalculationTest extends AbstractTest {
    @BeforeClass(alwaysRun = true)
    public void createCalculator() {
        calculator = CalculatorFactory.createCalculator(ACCURATE);
    }

    @AfterClass(alwaysRun = true)
    public void discardCalculator() {
        calculator = null;
    }

    @Test(groups = {"calculator", "positive", "accurate_type"},
            dataProvider = "correct addition data", dataProviderClass = TestData.class,
    invocationCount = 10, threadPoolSize = 2, retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void accurateAdditionTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.add(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "accurate_type"},
            dataProvider = "correct subtraction data", dataProviderClass = TestData.class,
            invocationCount = 10, threadPoolSize = 2, retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void accurateSubtractionTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.subtract(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "accurate_type"},
            dataProvider = "correct multiplication data", dataProviderClass = TestData.class,
            invocationCount = 10, threadPoolSize = 2, retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void accurateMultiplicationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.multiply(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "accurate_type"},
            dataProvider = "correct division data", dataProviderClass = TestData.class,
            invocationCount = 10, threadPoolSize = 2, retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void accurateDivisionTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.divide(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "negative", "accurate_type"}, expectedExceptions = CalculatorException.class,
            invocationCount = 5, threadPoolSize = 5, retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void divisionByZeroTest()
            throws CalculatorException {
        calculator.divide(5, 0);
    }
}
