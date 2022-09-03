package Problem1;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();

        String string1;
        String string2;

        if (anagram.detectAnagram(string1 = "army", string2 = "Mary")) {
            System.out.println(string1 + " and " + string2 + " is anagram");
        }
        else {
            System.out.println(string1 + " and " + string2 + " are not anagram");
        }
    }
}
