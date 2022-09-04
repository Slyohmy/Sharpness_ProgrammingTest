package Problem5;

import java.util.Scanner;

public class AdvancedCalculator {


    public void advCalc() {

        char operator;
        char cont = 'Y';
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = 0;
        boolean invalidCharacter = false;

        do {
            if (!invalidCharacter) {
                System.out.print("Enter another number: ");
                num2 = Double.parseDouble(scanner.nextLine());
            }
            invalidCharacter = false;
            System.out.print("\nChoose operation\n[+]\n[-]\n[*]\n[/]");
            System.out.print("\n\nEnter: ");
            operator = scanner.nextLine().charAt(0);

            switch (operator) {
                case '+' -> {
                    num1 += num2;
                    System.out.println("The sum is " + num1);
                }
                case '-' -> {
                    num1 -= num2;
                    System.out.println("The sum is " + num1);
                }
                case '*' -> {
                    num1 *= num2;
                    System.out.println("The sum is " + num1);
                }
                case '/' -> {
                    num1 /= num2;
                    System.out.println("The sum is " + num1);
                }
                default -> {
                    System.out.println("Error! You've entered an invalid character.");
                    invalidCharacter = true;
                    continue;
                }
            }
            System.out.print("Continue?[Y/N]: ");
            cont = scanner.nextLine().charAt(0);
        } while (cont == 'Y' || cont == 'y');
    }
}

