package calc;

public class Division extends Opeation{
    public Division(double number1, double number2){
        super(number1, number2);
    }

    public double calculateResult()

    {
        return getNumber1()/getNumber2();
    }
}
