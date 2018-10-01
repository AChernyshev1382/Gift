package GiftBox;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String lollipopName;
        String caramelNeme;
        String marmeladeName;
        Integer countLollipop;
        Integer countCaramel;
        Integer countMarmelade;

        System.out.println("Введите наименование сладости");

        System.out.println("Первая сладость:");
        lollipopName = scanner.next();
        System.out.println("Количество:");
        countLollipop = scanner.nextInt();

        System.out.println("Вторая сладость:");
        caramelNeme = scanner.next();
        System.out.println("Количество:");
        countCaramel = scanner.nextInt();

        System.out.println("Третья сладость:");
        marmeladeName = scanner.next();
        System.out.println("Количество:");
        countMarmelade = scanner.nextInt();


        Map <String, Integer> sweets = new TreeMap<>();
        sweets.put(lollipopName, countLollipop);
        sweets.put(caramelNeme, countCaramel);
        sweets.put(marmeladeName, countMarmelade);




        Sweet[] present = {new Lollipop(lollipopName, countLollipop, 1.3, 2),
                new Caramel(caramelNeme, countCaramel, 3.7,5),
                new Marmalade(marmeladeName, countMarmelade,2.2, 15),
                //new Lollipop(lollipopName, 1.3,2)
        };

        int totalWeight = 0;
        double totalPrice = 0;


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
