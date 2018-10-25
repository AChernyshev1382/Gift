package junitHW;

public class CalculatePerimetrRectangle extends Calculated{
    public CalculatePerimetrRectangle(double sideA, double sideB){
        super( sideA, sideB );
    }

    public double getPerimetrRectangle(){
        return ( sideA+sideB )*2;
    }
}
