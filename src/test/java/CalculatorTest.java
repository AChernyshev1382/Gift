import calc.Addiction;
import calc.Division;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest{
    @Test
    public void testAddiction() {
        Addiction addiction = new Addiction(4,5);
        Assert.assertArrayEquals(9,Assert.);
    }

    @Test void testDivision(){
        Division division = new Division(10, 2);
        Assert.assertArrayEquals(5,division.calculateResult(),0);

    }
}
