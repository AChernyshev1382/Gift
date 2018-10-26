package junitHW;

public class Circle extends Calculated{
    public Circle(double radius){
        super( radius );
    }
    public double getAreaCircle(){
        return Math.PI*Math.pow( getRadius(), 2 );
    }

    public double getPerimCircle(){

        return 2*Math.PI*getRadius();
    }
}
