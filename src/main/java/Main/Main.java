package Main;

import Problem1.Anagram;
import Problem2.WebPageScanner;
import Problem3.SimpleCalculator;
import Problem5.AdvancedCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean running = true;

        while (running){
            System.out.println("***************************\n" +
                    "Main Menu\n Choose an app!\n " +
                    "[A] -> Anagram\n " +
                    "[B] -> WebPageScanner\n " +
                    "[C] -> SimpleCalculator\n " +
                    "[D] -> MultiCalculator\n " +
                    "[E] -> AdvancedCalculator\n " +
                    "[0] -> Exit Menu" +
                    "\n***************************");
            System.out.print("Enter here: ");

            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();

            switch (option) {
                case "A" -> Anagram(scanner);
                case "B" -> WebPageScanner(scanner);
                case "C" -> SimpleCalculator();
                case "D" -> MultiCalculator(scanner);
                case "E" -> AdvancedCalculator();
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

        WebPageScanner webPageScanner = new WebPageScanner();
        System.out.println("Enter URL of the website you'd like to scan: ");
        String url = scanner.nextLine();
        webPageScanner.webScan(url);

    }
    public static void SimpleCalculator() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.calc();
    }
    public static void MultiCalculator(Scanner scanner) {

    }
    public static void AdvancedCalculator() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.advCalc();
    }
}
