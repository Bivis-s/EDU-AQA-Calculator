package calculator_tests.float_inaccurate_calculation_test;

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

import static by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettingsTypes.FLOAT_INACCURATE;

@Listeners(UnstableTestListener.class)

public class FloatInaccurateCalculationTest extends AbstractTest {
    @BeforeClass(alwaysRun = true)
    public void createCalculator() {
        calculator = CalculatorFactory.createCalculator(FLOAT_INACCURATE);
    }

    @AfterClass(alwaysRun = true)
    public void discardCalculator() {
        calculator = null;
    }

    @Test(groups = {"calculator", "positive", "float_inaccurate_type"},
            dataProvider = "correct addition data", dataProviderClass = TestData.class,
            retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void floatInaccurateTypeAdditionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.add(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "float_inaccurate_type"},
            dataProvider = "correct subtraction data", dataProviderClass = TestData.class,
            retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void floatInaccurateTypeSubtractionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.subtract(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "float_inaccurate_type"},
            dataProvider = "correct multiplication data", dataProviderClass = TestData.class,
            retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void floatInaccurateTypeMultiplicationCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.multiply(p1, p2), expectedResult);
    }

    @Test(groups = {"calculator", "positive", "float_inaccurate_type"},
            dataProvider = "correct division data", dataProviderClass = TestData.class,
            retryAnalyzer = CalculatorDeactivatedRetryAnalyzer.class)
    public void floatInaccurateTypeDivisionCalculationTest(double p1, double p2, double expectedResult)
            throws CalculatorException {
        Assert.assertEquals(calculator.divide(p1, p2), expectedResult);
    }
}
