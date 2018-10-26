package junitHW;

public class Triangle extends Calculated{
    public Triangle(double sideA, double sideB, double sideC){
        super( sideA, sideB, sideC );
    }

    public double getPerimetrTriangle(){
        if(sideA<=0 || sideB <= 0 || sideC <=0){
            throw new IllegalArgumentException("Стороны треуголика не могут быть меньше или равны нулю");
        }
        if(sideA > sideB + sideC || sideB > sideA + sideC || sideC > sideA + sideB){
            throw new IllegalArgumentException( "Сумма двух сторон треугольника не может быть меньше третей стороны" );
        }

        return getSideA()+getSideB()+getSideC();
    }

    public double getAreaTriangle(){
        if(sideA<=0 || sideB <= 0 || sideC <=0){
            throw new IllegalArgumentException("Стороны треуголика не могут быть меньше или равны нулю");
        }
        if(sideA > sideB + sideC || sideB > sideA + sideC || sideC > sideA + sideB){
            throw new IllegalArgumentException( "Сумма двух сторон треугольника не может быть меньше третей стороны" );
        }

        double p = getPerimetrTriangle()/2;

        return Math.sqrt(p*((p-getSideA())*(p-getSideB())*(p-getSideC())));
    }

}
