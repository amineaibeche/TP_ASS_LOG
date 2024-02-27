package linecoverageTest;

import lineCoverageTest.Palindrome;
import lineCoverageTest.PalindromeCorrection;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Assert;

public class PalindromTest {
    Palindrome s;

    @BeforeEach
    public void Steup() {
        s = new Palindrome();
    }

    @Test
    public void testisPalindrome() {
        Assertions.assertEquals(true, PalindromeCorrection.isPalindrome("121"));
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
