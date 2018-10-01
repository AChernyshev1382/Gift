package GiftBox;

public class Caramel extends Sweet {

    private String uniq;

    public void setUniq(String uniq) {
        this.uniq = uniq;
    }

    public String getUniq() {
        return uniq;
    }

    public Caramel(String name, double price, double weight, String uniq) {
        super(name, price, weight);
        this.uniq = uniq;
    }
    @Override
    public String toString(){
        return super.toString() + " " + this.uniq;
    }

    public Caramel(String name, double price, double weight) {
        super(name, price, weight);
    }



}
