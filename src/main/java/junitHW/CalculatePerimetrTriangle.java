package junitHW;

public class CalculatePerimetrTriangle extends Calculated{
    public CalculatePerimetrTriangle(double sideA, double sideB, double sideC){
        super( sideA, sideB, sideC );
    }

    public double getPerimetrTriangle(){
        return getSideA()+getSideB()+getSideC();
    }

    public double getAreaTriangle(){

        double p = getPerimetrTriangle()/2;

        return Math.sqrt(p*((p-getSideA())*(p-getSideB())*(p-getSideC())));
    }

}

