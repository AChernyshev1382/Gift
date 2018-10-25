import junitHW.CalculatePerimetrTriangle;
import junitHW.CalculationAreaCircle;
import junitHW.CalculationPerimetrCircle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatedTest{
    CalculationAreaCircle calculationAreaCircle=new CalculationAreaCircle( 2 );
    CalculationPerimetrCircle calculationPerimetrCircle=new CalculationPerimetrCircle( 2 );
    CalculatePerimetrTriangle calculatePerimetrTriangle = new CalculatePerimetrTriangle( 1,2,3 );


    @Test
    public void testAreaCircle(){
        assertEquals( 12.566370614359172, calculationAreaCircle.getAreaCircle() );
    }

    @Test
    public void testPerimCircle(){
        assertEquals( 12.566370614359172, calculationPerimetrCircle.getPerimCircle() );
    }

    @Test
    public void testPerimetrTriangle(){
        assertEquals( 6.0, calculatePerimetrTriangle.getPerimetrTriangle() );
    }
}
