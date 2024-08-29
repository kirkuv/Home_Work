package Control_Work_1.Task_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new  Product("Apple", 40.0);
        Product banan = new Product("banan", 34.0);
        MarkedProduct TV = new MarkedProduct("TV", 1000, 27, "Упаковка повреждена");
       Cart cart = new Cart();
       cart.addProduct(apple,3);
       cart.addProduct(banan, 33);
       cart.addProduct(TV,23);
        List<CartItem> items = cart.getItems();
        for (CartItem item : items){
            System.out.println(item);
        }
        List <String> receipt = cart.generateReceipt();
        System.out.println("\nЧек");
        for (String line : receipt){
            System.out.println(line);
        }
    }
}
