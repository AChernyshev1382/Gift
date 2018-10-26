package junitHW;

public class Rectangle extends Calculated{
    public Rectangle(double sideA, double sideB){
        super( sideA, sideB );
    }
    public double getAreaRectangle(){
        return getSideA()*getSideB();
    }
    public double getPerimetrRectangle(){
        return ( getSideA()+getSideB() )*2;
    }

}
