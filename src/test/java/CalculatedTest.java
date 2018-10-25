import junitHW.CalculationAreaCircle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatedTest{
    CalculationAreaCircle calculationAreaCircle = new CalculationAreaCircle(2);

    @Test
    public void testAreaCircle(){
        assertEquals(12.566370614359172, calculationAreaCircle.getAreaCircle());
    }
}
