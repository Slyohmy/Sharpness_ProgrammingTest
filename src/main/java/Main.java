import Problem1.Anagram;
import Problem2.WebPageScanner;
import Problem3.SimpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean running = true;

        while (running){
            System.out.println("***************************\n" +
                    " Main Menu\n Choose an app!\n A -> Anagram\n B -> WebPageScanner" +
                    "\n C -> SimpleCalculator\n D -> MultiCalculator\n E -> AdvancedCalculator\n" +
                    " 0 -> Exit Menu\n***************************");

            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();

            switch (option) {
                case "A" -> Anagram(scanner);
                case "B" -> WebPageScanner(scanner);
                case "C" -> SimpleCalculator(scanner);
                case "D" -> MultiCalculator(scanner);
                case "E" -> AdvancedCalculator(scanner);
                case "0" -> {
                    System.out.println("Exiting...");
                    running = false;
                }
                default -> System.out.println("Error! You've entered an invalid character.");
            }
        }
    }
    public static void Anagram(Scanner scanner) {

        Anagram anagram = new Anagram();

        System.out.println("Enter first word: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second word: ");
        String string2 = scanner.nextLine();

        if (anagram.detectAnagram(string1, string2)){
            System.out.println(string1 + " and " + string2 + " are anagram.");
        }
        else {
            System.out.println(string1 + " and " + string2 + " are not anagram.");
        }
    }
    public static void WebPageScanner(Scanner scanner) {

    }
    public static void SimpleCalculator(Scanner scanner) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.calc();
        scanner.close();


    }
    public static void MultiCalculator(Scanner scanner) {

    }
    public static void AdvancedCalculator(Scanner scanner) {

    }

            /*Anagram anagram = new Anagram();

        String string1, string2;

        if (anagram.detectAnagram(string1 = "army", string2 = "Mary")) {
            System.out.println(string1 + " and " + string2 + " is anagram");
        }
        else {
            System.out.println(string1 + " and " + string2 + " are not anagram");
        }*/

}
