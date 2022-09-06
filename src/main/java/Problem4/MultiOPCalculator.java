package Problem4;

import java.util.Scanner;


public class MultiOPCalculator {


    public boolean multiOpCalc() {

        while (true) {
            System.out.println(
                    "Choose operators.\n " +
                            "[A] -> + and -\n " +
                            "[B] -> * and /\n " +
                            "[0] -> Return to Main Menu" );
            System.out.print("Enter here: ");

            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();

            switch (option) {
                case "A" -> plusAndMinus(scanner);
                case "B" -> multiAndDivi(scanner);
                case "0" -> {
                    System.out.println("Exiting...");
                    return false;
                }

                default -> System.out.println("Error! You've entered an invalid character.");
            }
        }
    }

    private static void plusAndMinus(Scanner scanner) {

        char operator;
        char cont = 'Y';
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
            System.out.print("\nChoose operation\n[+]\n[-]");
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

    private static void multiAndDivi(Scanner scanner) {

        char operator;
        char cont = 'Y';
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
            System.out.print("\nChoose operation\n[*]\n[/]");
            System.out.print("\n\nEnter: ");
            operator = scanner.nextLine().charAt(0);

            switch (operator) {
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