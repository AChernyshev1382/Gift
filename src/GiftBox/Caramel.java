package GiftBox;

public class Caramel extends Sweet {


    public Caramel(String name, Integer count, double price, double weight) {
        super(name, count, price, weight);
    }


    public Caramel(Caramel temp) {
        super(temp.getName(), temp.getCount(),temp.getPrice(), temp.getWeight());
    }




}
