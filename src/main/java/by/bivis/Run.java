package by.bivis;

import by.bivis.calculator.Calculator;
import by.bivis.calculator.calculator_factory.CalculatorFactory;

import java.util.Scanner;

import static by.bivis.calculator.calculator_factory.CalculatorSettingsType.*;

public class Run {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Calculator calculator;
//        while (true) {
//            System.out.println("Select a calculator mode:\n" +
//                    "1. Correct\n" +
//                    "2. Incorrect\n");
//            try {
//                int inputNum = Integer.parseInt(in.nextLine());
//                if (inputNum == 1) {
//                    calculator = CalculatorFactory.createCalculator(CORRECT);
//                    break;
//                } else if (inputNum == 2) {
//                    calculator = CalculatorFactory.createCalculator(INCORRECT);
//                    break;
//                } else {
//                    System.out.println("Input number is out of range\n");
//                }
//            } catch (Exception e) {
//                System.out.println("Incorrect input type\n");
//            }
//        }
//        boolean state = true;
//        while (state) {
//            System.out.println("Select an operation:\n" +
//                    "1. Add\n" +
//                    "2. Subtract\n" +
//                    "3. Multiply\n" +
//                    "4. Divide\n" +
//                    "0. Exit\n");
//            try {
//                int inputNum = Integer.parseInt(in.nextLine());
//                if (inputNum >= 1 && inputNum <= 4) {
//                    System.out.println("Enter first number: ");
//                    double n1 = Double.parseDouble(in.nextLine());
//                    System.out.println("Enter second number: ");
//                    double n2 = Double.parseDouble(in.nextLine());
//
//                    switch (inputNum) {
//                        case 1:
//                            System.out.println(calculator.add(n1, n2));
//                            break;
//                        case 2:
//                            System.out.println(calculator.subtract(n1, n2));
//                            break;
//                        case 3:
//                            System.out.println(calculator.multiply(n1, n2));
//                            break;
//                        case 4:
//                            System.out.println(calculator.divide(n1, n2));
//                            break;
//                    }
//                } else if (inputNum == 0){
//                    state = false;
//                } else {
//                    System.out.println("Input num is out of range\n");
//                }
//            } catch (Exception e) {
//                System.out.println(e.getMessage() + "\n");
//            }
//        }
    }
}
