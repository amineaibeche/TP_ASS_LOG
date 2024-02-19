import org.junit.Test;
import org.junit.Assert;

import static org.example.Fibonacci.fibonacci;

public class FibonacciTest {
    @Test
    public void termsTest(){
        int[] table = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
        for(int i = 0 ; i < table.length ; i++){
            try{
                Assert.assertEquals(table[i],fibonacci(i));
                System.out.println(i);
            }catch (Exception e){
                Assert.fail(e.getMessage());
            }
        }

        Assert.assertEquals(6765,fibonacci(20));
    }
}
