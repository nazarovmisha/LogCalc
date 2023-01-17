import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcLoggTest {

    private CalcLogg calcLogg;

    @Test
    public void getSum() {
        assertEquals(14, calcLogg.getSum(7, 7));
    }

    @Test
    public void getDivide() {
        assertEquals(25, calcLogg.getDivide(100, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void DivideWithExp(){
        calcLogg.getDivide(15,0);

    }

    @Test
    public void getSub() {
        assertEquals(12, calcLogg.getSub(71, 59));
    }

    @Test
    public void getMultiple(){
        assertEquals(28, calcLogg.getMultiple(14,2));
    }

    @Before
    public void initTest(){
        calcLogg= new CalcLogg();
    }

    @After
    public void afterTest(){
        calcLogg=null;
    }

}