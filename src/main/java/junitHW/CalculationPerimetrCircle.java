package junitHW;

public class CalculationPerimetrCircle extends Calculated{
    public CalculationPerimetrCircle(double radius){
        super( radius );
    }

    public double getPerimCircle(){
        return 2*Math.PI*getRadius();
    }
}