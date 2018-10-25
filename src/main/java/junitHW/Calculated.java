package junitHW;


public abstract class Calculated{
    double sideA;
    double sideB;
    double sideC;
    double length;
    double radius;

    public Calculated(double radius){
        this.length=length;
        this.radius=radius;
    }

    public Calculated(double sideA, double sideB, double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    public Calculated(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public double getSideC(){
        return sideC;
    }

    public double getLength(){
        return length;
    }

    public double getRadius(){
        return radius;
    }
}
