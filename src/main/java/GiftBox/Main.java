package GiftBox;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner ( System.in );


        System.out.println("Выберете сладость из списка:");
        System.out.println("============================");
        System.out.println("|Леденец                   |");
        System.out.println("|Карамель                  |");
        System.out.println("|Мармелад                  |");
        System.out.println("============================");


        String lollipopName = "Леденец";
        String lollipopColor = "Зеленый";
        double lollipopPrice = 1.1;
        double lollipopWeight = 1.2;
        System.out.println ( "Первая сладость:" + " " + lollipopName + " " + "Цена:" + " " + lollipopPrice + " " + "Вес:" + " " + lollipopWeight);
        System.out.println ( "Количество:" );
        Integer countLollipop = scanner.nextInt ();


        String caramelName = "Карамель";
        String caramelFilling = "Вишня";
        double caremelPrice = 2.2;
        double caremelWeight = 2.3;
        System.out.println ( "Вторая сладость:" + " " + caramelName + " " + "Цена:" + " " + caremelPrice + " " + "Вес:" + " " + caremelWeight);
        System.out.println ( "Количество:" );
        Integer countCaramel = scanner.nextInt ();


        String marmeladeName = "Мармелад";
        String marmeladeTaste = "Яблочный";
        double marmeladePrice = 3.3;
        double marmeladeWeight = 3.8;
        System.out.println ( "Третья сладость:"  + " " + marmeladeName + " " + "Цена:" + " " +  marmeladePrice + " " + "Вес:"  + " " + marmeladeWeight);
        System.out.println ( "Количество:" );
        Integer countMarmelade = scanner.nextInt ();


//        Map <String, Integer> sweets = new TreeMap<>();
//        sweets.put(lollipopName, countCaramel);
//        System.out.println(sweets.values());
//
//        lollipopName = new Lollipop();


        ArrayList<Sweet> present = new ArrayList <> ();
        present.add ( new Lollipop ( lollipopName, lollipopColor, countLollipop, lollipopPrice * countLollipop, lollipopWeight * countLollipop ) );
        present.add ( new Caramel ( caramelName, caramelFilling, countCaramel, caremelPrice * countCaramel, caremelWeight * countCaramel ) );
        present.add ( new Marmalade ( marmeladeName, marmeladeTaste, countMarmelade, marmeladePrice * countMarmelade, marmeladeWeight * countMarmelade ) );









        double totalWeight = 0;
        double totalPrice = 0;


        System.out.println ( "НОВОГОДНИЙ ПОДАРОК:" );

        for (int i = 0; i < present.size(); i++) {

            System.out.println ( present.get(i).toString () );

            totalPrice += present.get(i).getPrice();
            totalWeight += present.get(i).getWeight();


        }

        System.out.println("Общий вес: " + totalWeight);
        System.out.println("Общая цена " + totalPrice);


        System.out.println("=============================================");


        System.out.println ( "Изменить количетво сладостей?");
        System.out.println ("        Да/Нет                ");
        System.out.println ("----------------------------- ");
        String sweetAdd = scanner.next();
        if (sweetAdd.equals("Да")) {
            System.out.println( "Укажите сладость из списка:" );
            System.out.println("-----------------------------");
            System.out.println("|" + present.get( 0 ).name + "|");
            System.out.println("|" + present.get( 1 ).name + "|");
            System.out.println("|" + present.get( 2 ).name + "|");
            System.out.println("-----------------------------");
            String sweetName = scanner.next();



//            if(present.stream().anyMatch(f -> f.getName().equals(lollipopName))){
//                System.out.println( "Количество:" );
//                Integer newCountLollipop = scanner.nextInt();
//                present.get(0).setCount( countLollipop + newCountLollipop );


            if (sweetName.equals( present.get( 0 ).name )) {
                System.out.println( "Количество:" );
                Integer countLollipop1 = scanner.nextInt();
                present.get( 0 ).setCount( countLollipop + countLollipop1 );

            } else if (sweetName.equals( present.get( 1 ).name )) {
                System.out.println( "Количество:" );
                Integer countCaramel1 = scanner.nextInt();
                present.get( 1 ).setCount( countCaramel + countCaramel1 );

            } else if (sweetName.equals( present.get( 2 ).name )) {
                System.out.println( "Количество:" );
                Integer countMarmelade1 = scanner.nextInt();
                present.get( 2 ).setCount( countMarmelade + countMarmelade1 );

            } else {
                System.out.println();
                System.out.println( "Сладость " + sweetName + " не найдена" );
                System.out.println();
            }
        }
        System.out.println( "Формирование падарка завершено:" );
;
        for (int i = 0; i < present.size(); i++) {

//            System.out.println( present.get( i ).toString() );

            totalPrice += present.get( i ).getPrice();
            totalWeight += present.get( i ).getWeight();

        }

       present.stream().sorted((a,b) -> b.name.compareTo(a.name)).forEach(System.out::println); //сортировка по имени

//        present.stream().sorted((a,b) -> b.count.compareTo(a.count)).forEach(System.out::println); //сортировка по количеству

        System.out.println( "Общий вес: " + totalWeight );
        System.out.println( "Общая цена " + totalPrice );
    }
}
