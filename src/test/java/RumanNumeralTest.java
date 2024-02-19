import org.example.RumanNumeral;
import org.junit.Test;
import org.junit.Assert ;

public class RumanNumeralTest {
    @Test
    public void rumanNumeraltesting(){
        RumanNumeral r = new RumanNumeral();
        int result = r.convertModified("VII");
        Assert.assertEquals(7,result);
    }

}
