package Control_Work_1.Task_2;

import java.util.List;


public class Receipt {
    private List<CartItem> items;
    public Receipt(Cart cart){
        this.items=cart.getItems();
    }
    public void printReceipt (){
        System.out.println("Чек ");
        double total = 0;
        for (CartItem item:items){
            System.out.printf("%s - %d x %.2f = %.2f%n", item.getProduct().getName(),item.getQuantity(),
                    item.getProduct().getPrice(),item.totalPrice());
            total += item.totalPrice();
        }
        System.out.printf("Итого: %.2f%n", total);
    }
}
