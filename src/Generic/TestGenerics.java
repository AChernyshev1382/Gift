package Generic;

public class TestGenerics <T1, T2, T3>{

    private T1 obgect1;
    private T2 obgect2;
    private T3 obgect3;

    TestGenerics(T1 name, T2 count, T3 price){
        this.obgect1=name;
        this.obgect2=count;
        this.obgect3=price;
    }

    public T1 getName(){
        return obgect1;
    }

    public T2 getCount(){
        return obgect2;
    }

    public T3 getPrice(){
        return obgect3;
    }
}

    class PrintArray{
        public static void main(String[] args){
            TestGenerics <String, Integer, Double> printArray = new TestGenerics <>("Milk", 2, 55.02);

            System.out.println(
                    printArray.getName() + " Count: " +
                            printArray.getCount() + " Price: " +
                            printArray.getPrice() * printArray.getCount());
        }
    }

