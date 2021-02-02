package calculator_tests.test_tools;

import by.bivis.calculator.CalculatorException;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class UnstableTestListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test " + result.getName() + " passed successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test was failure");
        if (result.getThrowable().getClass() == CalculatorException.class) {
            System.out.println("CalculatorException thrown");
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped");
    }
}
