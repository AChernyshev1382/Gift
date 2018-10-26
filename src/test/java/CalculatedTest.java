import junitHW.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatedTest{
    Circle circle = new Circle( 3 );
    Triangle triangle = new Triangle( 3,4,5 );
    Rectangle rectangle = new Rectangle( 5,8 );


    //Площадь окружности
    @Test
    public void testAreaCircle(){
        assertEquals( 28.274333882308138, circle.getAreaCircle() );
    }


    //Длина окружности
    @Test
    public void testPerimCircle(){
        assertEquals( 18.84955592153876, circle.getPerimCircle() );
    }


    //Площадь треугольника
    @Test
    public void testAreaTriangle(){
        assertEquals( 6.0, triangle.getAreaTriangle() );
    }


    //Периметр треугодьника
    @Test
    public void testPerimetrTriangle(){
        assertEquals( 12.0, triangle.getPerimetrTriangle() );
    }

    //Площадь прямоугольника
    @Test
    public void testAreaRectangle(){
        assertEquals( 40.0, rectangle.getAreaRectangle());
    }


    //Периметр прямоугольника
    @Test
    public void testPerimetrRectangle(){
        assertEquals(26.0, rectangle.getPerimetrRectangle());
    }

}
