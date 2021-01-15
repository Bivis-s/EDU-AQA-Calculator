package calculator_tests.test_tools;

import by.bivis.calculator.CalculatorException;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CalculatorDeactivatedRetryAnalyzer implements IRetryAnalyzer {
    @Override
    public boolean retry(ITestResult iTestResult) {
        return iTestResult.getThrowable().getClass() == CalculatorException.class &&
                iTestResult.getThrowable().getMessage().equals("Calculator is deactivated");
    }
}
