package calculator_tests.calculator_factory_test;

import by.bivis.calculator.calculator_factory.CalculatorFactory;
import by.bivis.calculator.calculator_factory.calculator_settings.settings_classes.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettingsTypes.*;

public class CalculatorFactoryTest {
    @Test(description = "Create Calculator using Accurate Type parameter",
            groups = {"calculator", "positive", "calculator_factory"},
            priority = -5)
    public void createAccurateCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(ACCURATE).getCalculatorSettings().getClass(),
                AccurateCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using Incorrect Type parameter",
            groups = {"calculator", "positive", "calculator_factory"},
            priority = -5)
    public void createCasualCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(CASUAL).getCalculatorSettings().getClass(),
                CasualCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using Random Type parameter",
            groups = {"calculator", "positive", "calculator_factory"},
            priority = -4)
    public void createRandomCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(RANDOM).getCalculatorSettings().getClass(),
                RandomCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using Unstable Type parameter",
            groups = {"calculator", "positive", "calculator_factory"},
            priority = -4)
    public void createUnstableCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(UNSTABLE).getCalculatorSettings().getClass(),
                UnstableCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using Broken Type parameter",
            groups = {"calculator", "positive", "calculator_factory"},
            priority = -4)
    public void createBrokenCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(BROKEN).getCalculatorSettings().getClass(),
                BrokenCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using undefined Type parameter",
            groups = {"calculator", "positive", "calculator_factory"},
            expectedExceptions = IllegalArgumentException.class, priority = 5)
    public void createInvalidTypeCalculatorTest() {
        CalculatorFactory.createCalculator(UNDEFINED);
    }
}
