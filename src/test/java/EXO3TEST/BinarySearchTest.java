package EXO3TEST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import EXO3TP1.*;
public class BinarySearchTest {

    @Test
    public void existeTest(){
        int[] ints = {1, 2, 3, 4, 5};
        Assertions.assertEquals(2,BinarySearchCorrectoin.binarySearch(ints, 3));
    }
}
