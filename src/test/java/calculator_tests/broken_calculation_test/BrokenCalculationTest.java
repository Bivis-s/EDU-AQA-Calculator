package calculator_tests.broken_calculation_test;

import by.bivis.calculator.CalculatorException;
import by.bivis.calculator.calculator_factory.CalculatorFactory;
import calculator_tests.AbstractTest;
import calculator_tests.TestData;
import calculator_tests.test_tools.CalculatorDeactivatedRetryAnalyzer;
import calculator_tests.test_tools.UnstableTestListener;
import org.testng.Assert;
import org.testng.annotations.*;

import static by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettingsTypes.BROKEN;

@Listeners(UnstableTestListener.class)

public class BrokenCalculationTest extends AbstractTest {
    @BeforeClass(alwaysRun = true)
    public void createCalculator() {
        calculator = CalculatorFactory.createCalculator(BROKEN);
    }

    @AfterClass(alwaysRun = true)
    public void discardCalculator() {
        calculator = null;
    }

    @Test(groups = {"calculator", "positive", "broken_type"},
            dataProvider = "correct addition data", dataProviderClass = TestData.class,
            retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void brokenTypeAdditionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.add(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "broken_type"},
            dataProvider = "correct subtraction data", dataProviderClass = TestData.class,
            retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void brokenTypeSubtractionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.subtract(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "broken_type"},
            dataProvider = "correct multiplication data", dataProviderClass = TestData.class,
            retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void brokenTypeMultiplicationCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.multiply(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "broken_type"},
            dataProvider = "correct division data", dataProviderClass = TestData.class,
            retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void brokenTypeDivisionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.divide(p1, p2), expectedResult);
    }
}
