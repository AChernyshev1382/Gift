package GiftBox;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.*;


public class Main {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);



        String lollipopName = null;



        String caramelNeme;
        String marmeladeName;

        Integer countCaramel;
        Integer countMarmelade;


        Double caremelPrice;
        Double marmeladePrice;





        System.out.println("Введите наименование сладости");


        System.out.println( "Первая сладость:" );

        try{
        lollipopName = scanner.next();

        }catch (Exception e){

            if (!lollipopName.equals( "Леденец" )) {
                    System.out.println("wqerqwerqwer");
           }
        }

        System.out.println( "Количество:" );
        Integer countLollipop = scanner.nextInt();
        System.out.println( "Укажите цену:" );
        Double lollipopPrice = scanner.nextDouble();
        System.out.println( "Укажаите вес:" );
        Double lollipopWeight = scanner.nextDouble();




//        }catch (Throwable throwable){
//
//            String lol = lollipopName;;
//            if (lol.equals( "Леденец" )){
//                if (false)
//                    System.out.println("Error");
//            }
//        }


//
//        System.out.println("Вторая сладость:");
//        caramelNeme = scanner.next();
//        System.out.println("Количество:");
//        countCaramel = scanner.nextInt();
//
//        System.out.println("Третья сладость:");
//        marmeladeName = scanner.next();
//        System.out.println("Количество:");
//        countMarmelade = scanner.nextInt();


        Map <String, Integer> sweets = new TreeMap<>();
        sweets.put(lollipopName, countLollipop);
//        sweets.put(caramelNeme, countCaramel);
//        sweets.put(marmeladeName, countMarmelade);
        System.out.println(sweets.values());




        Sweet[] present = {new Lollipop(lollipopName, countLollipop, lollipopPrice * countLollipop, lollipopWeight * countLollipop)
                //new Caramel(caramelNeme, countCaramel, 3.7,5),
                //new Marmalade(marmeladeName, countMarmelade,2.2, 15),
                //new Lollipop(lollipopName, 1.3,2)
        };

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
