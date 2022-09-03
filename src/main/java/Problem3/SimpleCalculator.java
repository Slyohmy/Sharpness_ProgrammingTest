package Problem3;

import java.util.Scanner;

public class SimpleCalculator {

    public void calc() {

        double num1, num2;
        char operator;
        double result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scanner.nextDouble();

        System.out.println("Pick an operator: +, -, *, or /");
        operator = scanner.next().charAt(0);

        System.out.println("Enter second number");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
            }
            case '/' -> {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            }
            default -> System.out.println("Error! You've entered an invalid operator.");
        }

        scanner.close();
    }
}

