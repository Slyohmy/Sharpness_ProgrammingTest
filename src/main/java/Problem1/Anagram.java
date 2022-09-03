package Problem1;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    public boolean detectAnagram(String string1, String string2) {

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        char[] sortedString1 = string1.toCharArray();
        Arrays.sort(sortedString1);

        char[] sortedString2 = string2.toCharArray();
        Arrays.sort(sortedString2);

        boolean result = Arrays.equals(sortedString1, sortedString2);

        return result;

        //return Arrays.equals(sortedString1, sortedString2);
    }
}

