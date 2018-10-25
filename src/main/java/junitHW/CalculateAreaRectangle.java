package junitHW;

public class CalculateAreaRectangle extends Calculated{
    public CalculateAreaRectangle(double sideA, double sideB){
        super( sideA, sideB );
    }
    public double getAreaRectangle(){
        return getSideA()*getSideB();
    }
}
