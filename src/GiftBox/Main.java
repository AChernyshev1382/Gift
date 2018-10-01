package GiftBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String lollipopName;
        String caramelNeme;
        String marmeladeName;
        System.out.println("Введите наименование сладости");
        lollipopName = scanner.next();
        caramelNeme = scanner.next();
        marmeladeName = scanner.next();



        Sweet[] present = {new Lollipop(lollipopName , 1.3, 2),
                new Caramel(caramelNeme, 3.7,5, " "), new Marmalade(marmeladeName, 2.2, 15)};

        int totalWeight = 0;
        double totalPrice = 0;
        //String nn;

        System.out.println("НОВОГОДНИЙ ПОДАРОК:");
        for (int i = 0; i < present.length; i++ ){

            System.out.println(present[i].toString());
            totalWeight = (int) (totalWeight+present[i].getWeight());
            totalPrice = totalPrice+present[i].getPrice();

        }

        System.out.println("Общий вес: " + totalWeight);
        System.out.println("Общая цена " + totalPrice);


    }
}
