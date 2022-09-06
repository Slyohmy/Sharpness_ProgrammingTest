package Main;

import Problem1.Anagram;
//import Problem2.WebPageScanner;
import Problem3.SimpleCalculator;
import Problem4.MultiOPCalculator;
import Problem5.AdvancedCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean running = true;

        while (running) {
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
                case "A" -> Anagram();
                case "B" -> WebPageScanner();
                case "C" -> SimpleCalculator();
                case "D" -> MultiOPCalculator();
                case "E" -> AdvancedCalculator();
                case "0" -> {
                    System.out.println("Exiting...");
                    running = false;
                }
                default -> System.out.println("Error! You've entered an invalid character.");
            }
        }
    }

    public static void Anagram() {

        Anagram anagram = new Anagram();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String string2 = scanner.nextLine();

        if (anagram.detectAnagram(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagram.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagram.");
        }
    }

    public static void WebPageScanner() {

        /*WebPageScanner webPageScanner = new WebPageScanner();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter URL of the website you'd like to scan: ");
        String url = scanner.nextLine();
        webPageScanner.webScan(url);*/

    }

    public static void SimpleCalculator() {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.calc();
    }

    public static void MultiOPCalculator() {
        MultiOPCalculator multiCalculator = new MultiOPCalculator();
        multiCalculator.multiOpCalc();

    }

    public static void AdvancedCalculator() {

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.advCalc();
    }
}
