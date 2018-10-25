package calc;

public class Addiction extends Opeation{
    public Addiction(double number1, double number2){
        super(number1, number2);
    }

    public double calculateResult()

    {
        return getNumber1() + getNumber2();
    }
}