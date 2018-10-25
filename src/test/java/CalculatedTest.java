import junitHW.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatedTest{
    CalculationAreaCircle calculationAreaCircle=new CalculationAreaCircle( 2 );
    CalculationPerimetrCircle calculationPerimetrCircle=new CalculationPerimetrCircle( 2 );
    CalculatePerimetrTriangle calculatePerimetrTriangle = new CalculatePerimetrTriangle( 1,2,3 );
    CalculatePerimetrRectangle calculatePerimetrRectangle= new CalculatePerimetrRectangle( 5,8 );
    CalculateAreaRectangle calculateAreaRectangle = new CalculateAreaRectangle( 5,10 );

//площадь окружности
    @Test
    public void testAreaCircle(){
        assertEquals( 12.566370614359172, calculationAreaCircle.getAreaCircle() );
    }


//длина окружности
    @Test
    public void testPerimCircle(){
        assertEquals( 12.566370614359172, calculationPerimetrCircle.getPerimCircle() );
    }


//Периметр треугодьника
    @Test
    public void testPerimetrTriangle(){
        assertEquals( 6.0, calculatePerimetrTriangle.getPerimetrTriangle() );
    }


//Периметр прямоугольника
    @Test
    public void testPerimetrRectangle(){
        assertEquals(26.0, calculatePerimetrRectangle.getPerimetrRectangle());
    }


//площадь прямоугольника
    @Test
    public void testAreaRectangle(){
        assertEquals( 50.0, calculateAreaRectangle.getAreaRectangle());
    }
}
