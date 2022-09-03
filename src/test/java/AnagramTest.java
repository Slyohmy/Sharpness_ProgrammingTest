import Problem1.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AnagramTest {
    Anagram anagram = new Anagram();

    @Test
    public void checkIfAnagram() {
        assertTrue(anagram.detectAnagram("abc", "cba"));
    }

    @Test
    public void checkIfNotAnagram() {
        assertFalse(anagram.detectAnagram("abc", "def"));
    }

    @Test
    public void checkIfCasesensitive() {
        assertEquals(anagram.detectAnagram("NOMIS", "simon"), equals(this));
    }
}
