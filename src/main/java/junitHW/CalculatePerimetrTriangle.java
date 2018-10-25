package junitHW;

public class CalculatePerimetrTriangle extends Calculated{
    public CalculatePerimetrTriangle(double sideA, double sideB, double sideC){
        super( sideA, sideB, sideC );
    }

    public double getPerimetrTriangle(){
        return getSideA()+getSideB()+getSideC();
    }

}

