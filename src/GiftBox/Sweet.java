package GiftBox;

import java.io.IOException;

public class Sweet {

    String name;
    double price;
    double weight;
    Integer count;

    public Sweet(String name, Integer count, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.count = count;

    }

    public Integer getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
//        try {

            return this.name + " " + this.count + " Шт.," + " Цена: " + this.price + ", Вес: " + this.weight;
//        } catch ( IOException ex ){
//            if (!this.name.equals( "Карамель" ) || !this.name.equals( "Леденец" ) || !this.name.equals( "Ьармелад" ))
//                System.out.println("Ошибка");
//        }
//    return toString();
    }
}
