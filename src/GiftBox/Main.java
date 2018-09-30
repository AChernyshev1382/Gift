package GiftBox;

public class Main {
    public static void main(String[] args) {

        Sweet[] present = {new Lollipop("Леденец", 1.3, 2),
                new Caramel("Карамель", 3.7,5), new Marmalade("Мармелад", 2.2, 15)};

        int totalWeight = 0;
        double totalPrice = 0;
        String nn;
        for (double i = 0; i < present.length; i++ ){
            System.out.println(present[(int) i].getName() +" Вес:" + present[(int) i].getWeight() + "." + " Цена:" + present[(int) i].getPrice());
            totalWeight = (int) (totalWeight+present[(int) i].getWeight());
            totalPrice = (double) (totalPrice+present[(int) i].getPrice());
        }
        System.out.println("Общий вес: " + totalWeight);
        System.out.println("Общая цена "+ totalPrice);


    }
}
