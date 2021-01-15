package calculator_tests;

import by.bivis.calculator.Calculator;
import org.testng.annotations.*;

public abstract class AbstractTest {
    protected Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void activateCalculator() {
        calculator.activate();
    }

    @AfterMethod(alwaysRun = true)
    public void deactivateCalculator() {
        calculator.deactivate();
    }
}
