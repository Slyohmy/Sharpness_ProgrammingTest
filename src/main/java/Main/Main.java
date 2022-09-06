package Main;

import Problem1.Anagram;
//import Problem2.WebPageScanner;
import Problem3.SimpleCalculator;
import Problem4.MultiOPCalculator;
import Problem5.AdvancedCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Anagram anagram = new Anagram();
        //WebPageScanner webPageScanner = new WebPageScanner();
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        MultiOPCalculator multiCalculator = new MultiOPCalculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

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
                case "A" -> anagram.inputScanIfAnagram();
                case "B" -> { //webPageScanner.inputWebScan();
                }
                case "C" -> simpleCalculator.calc();
                case "D" -> multiCalculator.multiOpCalc();
                case "E" -> advancedCalculator.advCalc();
                case "0" -> {
                    System.out.println("Exiting...");
                    running = false;
                }
                default -> System.out.println("Error! You've entered an invalid character.");
            }
        }
    }
}
