//package GiftBox;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Menu {
//    public static void main (String[] args) {
//
//        Main m = new Main();
//        HashMap<Integer, String> menu = new HashMap <>();
//        menu.put( 1, "Введите цену" );
//        menu.put( 2, "Введите вес" );
//
//        m.goMenu("Header",menu);
//
//    }
//
//    public String goMenu (String header, HashMap<Integer, String> menu){
//        System.out.println(header);
//
//        for (Map.Entry m:menu.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
//        Scanner scanner = new Scanner( System.in );
//        boolean flag = false;
//        int section = -1;
//        while (!flag){
//            section = scanner.nextInt();
//            if (menu.keySet().contains( section )) {
//                flag = true;
//                break;
//            }
//        }
//
//        String res = scanner.next();
//        HashMap<Integer, String> ret = new HashMap<>(  );
//        ret.put(section, res);
//
//        return res;
//    }
//}
