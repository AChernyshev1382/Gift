package GiftBox;

import java.util.*;


public class Main {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);



        System.out.println("Введите наименование сладости");


        System.out.println( "Первая сладость:" );

        String lollipopName = scanner.next();
        System.out.println( "Количество:" );
        Integer countLollipop = scanner.nextInt();
        System.out.println( "Укажите цену:" );
        Double lollipopPrice = scanner.nextDouble();
        System.out.println( "Укажаите вес:" );
        Double lollipopWeight = scanner.nextDouble();





        System.out.println("Вторая сладость:");
        String caramelNeme = scanner.next();
        System.out.println("Количество:");
        Integer countCaramel = scanner.nextInt();
        System.out.println( "Укажите цену:" );
        Double caremelPrice = scanner.nextDouble();
        System.out.println( "Укажаите вес:" );
        Double caremelWeight = scanner.nextDouble();




        System.out.println("Третья сладость:");
        String marmeladeName = scanner.next();
        System.out.println("Количество:");
        Integer countMarmelade = scanner.nextInt();
        System.out.println( "Укажите цену:" );
        Double marmeladePrice = scanner.nextDouble();
        System.out.println( "Укажаите вес:" );
        Double marmeladeWeight = scanner.nextDouble();


//        Map <String, Integer> sweets = new TreeMap<>();
//        sweets.put(lollipopName, countCaramel);
//        System.out.println(sweets.values());
//
//        lollipopName = new Lollipop();




        Sweet[] present = {new Lollipop(lollipopName, countLollipop, lollipopPrice * countLollipop, lollipopWeight * countLollipop),
                new Caramel(caramelNeme, countCaramel, caremelPrice * countCaramel, caremelWeight * countCaramel),
                new Marmalade(marmeladeName, countMarmelade,marmeladePrice * countMarmelade, marmeladeWeight * countMarmelade)
        };


//        Caramel Caramel1 = new Caramel( "АО", 1, 2, 3 );






        double totalWeight = 0;
        double totalPrice = 0;


        System.out.println("НОВОГОДНИЙ ПОДАРОК:");

        for (int i = 0; i < present.length; i++ ){

            System.out.println(present[i].toString());

            totalWeight = totalWeight+present[i].getWeight();
            totalPrice = totalPrice+present[i].getPrice();

        }

        System.out.println("Общий вес: " + totalWeight);
        System.out.println("Общая цена " + totalPrice);



    }
}
