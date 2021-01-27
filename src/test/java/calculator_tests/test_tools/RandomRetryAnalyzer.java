package calculator_tests.test_tools;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RandomRetryAnalyzer implements IRetryAnalyzer {
    private int counter = 0;
    private final int MAX_RETRY_COUNT = 15;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < MAX_RETRY_COUNT) {
            counter++;
            return true;
        }
        return false;
    }
}
