package Control_Work_1.Task_2;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    public Store(){
        products = new ArrayList<>();
        products.add(new Product("Apple", 40.0));
        products.add(new Product("banan", 34.0));
        products.add(new Product("peach", 22.0));
        products.add(new Product("potato", 4.0));
        products.add(new Product("TV", 140.0));
        products.add(new Product("IPhone", 340.0));
        products.add(new Product("ПЭВМ", 1140.0));
        products.add(new Product("Знания", 22222.0));
    }
    public List<Product> getProducts(){
        return products;
    }
}
