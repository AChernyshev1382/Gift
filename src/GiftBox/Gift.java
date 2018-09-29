package GiftBox;

public class Gift {

    double totalPrice;
    double totalWeight;

    public Gift(double totalPrice, double totalWeight) {
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }



}
