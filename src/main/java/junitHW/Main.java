package junitHW;

public class Main{
    public static void main(String[] args){
        CalculationAreaCircle calculationAreaCircle = new CalculationAreaCircle( 3 );
        CalculationPerimetrCircle calculationPerimetrCircle = new CalculationPerimetrCircle( 3 );
        CalculatePerimetrTriangle calculatePerimetrTriangle = new CalculatePerimetrTriangle( 1,2,3 );


        System.out.println(calculationAreaCircle.getAreaCircle());
        System.out.println(Math.PI);
        System.out.println(calculationPerimetrCircle.getPerimCircle());
        System.out.println(calculatePerimetrTriangle.getPerimetrTriangle());

    }
}
