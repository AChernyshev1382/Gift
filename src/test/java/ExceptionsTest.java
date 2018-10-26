import junitHW.Circle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExceptionsTest{


    Circle circle = new Circle( -3 );


    @Test(expected=IllegalArgumentException.class)
    public void testExceptionAreaCircle(){
        assertEquals(28.274333882308138, circle.getAreaCircle());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testExettionPerimCircle(){
        assertEquals( 28.274333882308138, circle.getPerimCircle());
    }
}
