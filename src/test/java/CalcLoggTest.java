import org.junit.Test;

import static org.junit.Assert.*;

public class CalcLoggTest {

private CalcLogg calcLogg;

@Test
public void getSum(){
    assertEquals(14, calcLogg.getSum(7,7));
}


}