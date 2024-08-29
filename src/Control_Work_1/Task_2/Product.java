package Control_Work_1.Task_2;

public class Product {
    private String name;
    private double price;
    public Product (String name, double price){
        this.name= name;
        this.price= price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        return String.format("%s, Цена - %.2f", name, price);
    }
}
