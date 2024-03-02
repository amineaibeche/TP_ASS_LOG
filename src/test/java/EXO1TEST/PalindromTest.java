package EXO1TEST;

import EXO1TP1.Palindrome;
import EXO1TP1.PalindromeCorrection;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class PalindromTest {
    Palindrome s;

    @BeforeEach
    public void Steup() {
        s = new Palindrome();
    }

    @Test
    public void testisPalindrome() {
        Assertions.assertEquals(true, Palindrome.isPalindrome(null));
    }

    @Test
    public void testisälondromNull() {
        try {
            Class<? extends Throwable> NullPointerException = null;
            Assertions.assertThrows(NullPointerException.class,()->PalindromeCorrection.isPalindrome(null));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}
