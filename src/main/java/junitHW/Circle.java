package junitHW;

public class Circle extends Calculated{
    public Circle(double radius){
        super( radius );
    }

    public double getAreaCircle(){

        if(getRadius()<=0){
            throw new IllegalArgumentException( "Радиус не может быть меньше или равен нулю" );
        }

        return Math.PI*Math.pow( getRadius(), 2 );
    }

    public double getPerimCircle(){
        if(getRadius()<=0){
            throw new IllegalArgumentException( "Радиус не может быть меньше или равен нулю" );
        }

        return 2*Math.PI*getRadius();
    }
}