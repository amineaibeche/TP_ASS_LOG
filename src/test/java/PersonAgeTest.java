import org.example.Person;
import org.junit.Test;
import org.junit.Assert ;
public class PersonAgeTest {
    public void setup(){
        Person p  = new Person("name", "lastname" , 18);
    }

    @Test
    public void testFullname(){
        Person p = new Person("amine" , "aibeche" , 23);
        Assert.assertEquals(p.getFullName(),"amine aibeche");
    }

    @Test
    public void testAgeadult(){
        Person p = new Person("amine" , "aibeche" , 23);
        Assert.assertTrue(p.isAdult());
    }

    @Test
    public void testAgenotAdult(){
        Person p = new Person("amine" , "aibeche" , 17);
        Assert.assertFalse(p.isAdult());
    }

    @Test
    public void testAge18exactly(){
        Person p = new Person("amine" , "aibeche" , 18);
        Assert.assertTrue(p.isAdult());
    }

}
