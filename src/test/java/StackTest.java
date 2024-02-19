import org.example.Stack;
import org.junit.Test ;
import org.junit.Assert;
import org.junit.Before ;

public class StackTest {
    private Stack s ;
    @Before
    public void Steup(){
       s = new Stack();
    }



    @Test
    public void testisemptytrue(){
        Assert.assertTrue(s.isEmpty());
    }



    @Test
    public void testSize(){
        Assert.assertEquals(0,s.size());
    }
    @Test
    public void testisemptyfalse(){
        s.push(5);
        Assert.assertFalse(s.isEmpty());
    }



    @Test
    public void testPush(){
       int sizebeforePush = s.size();
       s.push(12);
       int sizeafterPush = s.size();
       Assert.assertEquals(1 ,sizeafterPush-sizebeforePush );
    }

    @Test
    public  void testPeekwhene_empty(){
      try{
          int head  = s.peek() ;

      }catch (Exception exeption){
          Assert.fail(exeption.getMessage());

      }
    }

    @Test
    public void testPeekwhen_notempty(){
        s.push(5);
        int head = s.peek();
        Assert.assertEquals(5,head);
    }

    @Test
    public void testPop(){
        try {
            s.push(8);
            int size1  = s.size();
            s.pop();
            int size2 = s.size();
            Assert.assertEquals(1,size1-size2);
        } catch (IllegalStateException e) {
            // Si une ArithmeticException est attrapée, le test réussit
            System.out.println("test");
            System.out.println("test2");
            Assert.fail(e.getMessage());
        }
    }
}
