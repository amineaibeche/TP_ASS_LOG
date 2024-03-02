package EXO2TEST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import EXO2TP1.*;

public class AnagramTest {
    @Test
    public  void isAnagramTest(){
        Assertions.assertEquals(true,Anagram.isAnagram("amine","minea"));
    }
}
