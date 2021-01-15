package by.bivis;

import by.bivis.calculator.Calculator;
import by.bivis.calculator.calculator_factory.CalculatorFactory;

import java.util.Scanner;

import static by.bivis.calculator.calculator_factory.calculator_settings.CalculatorSettingsTypes.*;

public class Run {
    private static final Scanner IN = new Scanner(System.in);

    private static double getDoublesFromConsole(String message) {
        while (true) {
            try {
                System.out.println(message);
                return Double.parseDouble(IN.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Calculator calculator = null;

        boolean state = true;
        while (state) {
            System.out.println("Select a calculator mode:\n" +
                    "1. Accurate\n" +
                    "2. Casual\n" +
                    "3. Random\n" +
                    "4. Unstable\n" +
                    "5. Broken\n");
            try {
                int inputNum = Integer.parseInt(IN.nextLine());
                switch (inputNum) {
                    case 1:
                        calculator = CalculatorFactory.createCalculator(ACCURATE);
                        state = false;
                        break;
                    case 2:
                        calculator = CalculatorFactory.createCalculator(CASUAL);
                        state = false;
                        break;
                    case 3:
                        calculator = CalculatorFactory.createCalculator(RANDOM);
                        state = false;
                        break;
                    case 4:
                        calculator = CalculatorFactory.createCalculator(UNSTABLE);
                        state = false;
                        break;
                    case 5:
                        calculator = CalculatorFactory.createCalculator(BROKEN);
                        state = false;
                        break;
                    default:
                        System.out.println("Input number is out of range\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Incorrect input type\n");
            }
        }

        state = true;
        while (state) {
            System.out.println("Select an operation:\n" +
                    "1. Add\n" +
                    "2. Subtract\n" +
                    "3. Multiply\n" +
                    "4. Divide\n" +
                    "5. Activate Calculator\n" +
                    "6. Deactivate Calculator\n" +
                    "0. Exit\n");
            try {
                int inputNum = Integer.parseInt(IN.nextLine());
                switch (inputNum) {
                    case 1:
                        System.out.println(calculator
                                .add(getDoublesFromConsole("Enter first number to add: "),
                                getDoublesFromConsole("Enter second number to add: ")));
                        break;
                    case 2:
                        System.out.println(calculator
                                .subtract(getDoublesFromConsole("Enter first number to subtract: "),
                                getDoublesFromConsole("Enter second number to subtract: ")));
                        break;
                    case 3:
                        System.out.println(calculator
                                .multiply(getDoublesFromConsole("Enter first number to multiply: "),
                                getDoublesFromConsole("Enter second number to multiply: ")));
                        break;
                    case 4:
                        System.out.println(calculator
                                .divide(getDoublesFromConsole("Enter first number to divide: "),
                                getDoublesFromConsole("Enter second number to divide: ")));
                        break;
                    case 5:
                        calculator.activate();
                        if (calculator.activate()) {
                            System.out.println("Calculator has been activated");
                        } else {
                            System.out.println("Calculator is already activated");
                        }
                        break;
                    case 6:
                        calculator.deactivate();
                        if (calculator.deactivate()) {
                            System.out.println("Calculator has been deactivated");
                        } else {
                            System.out.println("Calculator is already deactivated");
                        }
                        break;
                    case 0:
                        state = false;
                        break;
                    default:
                        System.out.println("Input num is out of range\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\n");
            }
        }
    }
}
