import junitHW.Circle;
import junitHW.Rectangle;
import junitHW.Triangle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExceptionsTest{


    Circle circle=new Circle( -3 );
    Triangle triangle=new Triangle( 2, 2, 10 );
    Rectangle rectangle=new Rectangle( -5, 5 );


    @Test(expected=IllegalArgumentException.class)
    public void testExceptionAreaCircle(){
        assertEquals( 28.274333882308138, circle.getAreaCircle() );
    }

    @Test(expected=IllegalArgumentException.class)
    public void testExceptionPerimCircle(){
        assertEquals( 28.274333882308138, circle.getPerimCircle() );
    }

    @Test(expected=IllegalArgumentException.class)
    public void testExceptionAreaTriangle(){
        assertEquals( 6.0, triangle.getAreaTriangle() );

    }

    @Test(expected=IllegalArgumentException.class)
    public void testExceptionPerimTriangle(){
        assertEquals( 12.0, triangle.getPerimetrTriangle());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testExceptionAreaRectangle(){
        assertEquals( 40.0, rectangle.getAreaRectangle());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testExceptionPerimRectangle(){
        assertEquals( 26.0, rectangle.getPerimetrRectangle());
    }
}