package junitHW;

public class CalculationAreaCircle extends Calculated{

    public CalculationAreaCircle(double radius){
        super(radius);
    }

    public double getAreaCircle(){
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
