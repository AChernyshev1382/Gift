package junitHW;

public class Main{
    public static void main(String[] args){
        Circle circle = new Circle( 3 );
        Triangle triangle = new Triangle( 3,4,5 );
        Rectangle rectangle = new Rectangle( 5,8 );


        System.out.println(Math.PI);
        System.out.println("Площадь круга: " + circle.getAreaCircle());
        System.out.println("Длина окружности: " + circle.getPerimCircle());
        System.out.println("Площадь тереугольника: " + triangle.getAreaTriangle());
        System.out.println("Периметр треугольника: " + triangle.getPerimetrTriangle());
        System.out.println("Площадь прямоугольника: " + rectangle.getAreaRectangle());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimetrRectangle());

    }
}
