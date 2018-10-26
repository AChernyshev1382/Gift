package junitHW;

public class Rectangle extends Calculated{
    public Rectangle(double sideA, double sideB){
        super( sideA, sideB );
    }

    public double getAreaRectangle(){
        if(sideA <= 0 || sideB <= 0){
            throw new IllegalArgumentException("Стороны прямоугольника не могут быть меньше или равны нулю");
        }

        return getSideA()*getSideB();
    }

    public double getPerimetrRectangle(){
        if(sideA <= 0 || sideB <= 0){
            throw new IllegalArgumentException("Стороны прямоугольника не могут быть меньше или равны нулю");
        }
        return ( getSideA()+getSideB() )*2;
    }

}
