package calculator_tests;

import by.bivis.calculator.calculator_factory.CalculatorFactory;
import by.bivis.calculator.calculator_factory.calculator_settings.settings_classes.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettingsTypes.*;

public class CalculatorFactoryTest {
    @Test(description = "Create Calculator using Accurate Type parameter")
    public void createAccurateCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(ACCURATE).getCalculatorSettings().getClass(),
                AccurateCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using Incorrect Type parameter")
    public void createIncorrectCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(CASUAL).getCalculatorSettings().getClass(),
                CasualCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using Random Type parameter")
    public void createRandomCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(RANDOM).getCalculatorSettings().getClass(),
                RandomCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using Unstable Type parameter")
    public void createUnstableCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(UNSTABLE).getCalculatorSettings().getClass(),
                UnstableCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using Broken Type parameter")
    public void createBrokenCalculatorTest() {
        Assert.assertEquals(CalculatorFactory.createCalculator(BROKEN).getCalculatorSettings().getClass(),
                BrokenCalculatorSettings.class);
    }

    @Test(description = "Create Calculator using undefined Type parameter",
            expectedExceptions = IllegalArgumentException.class)
    public void createInvalidTypeCalculatorTest() {
        CalculatorFactory.createCalculator(UNDEFINED);
    }
}
