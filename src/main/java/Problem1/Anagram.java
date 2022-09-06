package Problem1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public boolean detectAnagram(String string1, String string2) {

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        char[] sortedString1 = string1.toCharArray();
        Arrays.sort(sortedString1);

        char[] sortedString2 = string2.toCharArray();
        Arrays.sort(sortedString2);

        return Arrays.equals(sortedString1, sortedString2);
    }

    public void inputScanIfAnagram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String string2 = scanner.nextLine();

        if (detectAnagram(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagram.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagram.");
        }
    }
}

