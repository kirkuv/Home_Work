package Control_Work_1.Task_2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
   private List<CartItem> items;
   public Cart(){
       items = new ArrayList<>();
   }
    public void addProduct (Product product, int quantity){
       items.add(new CartItem(product,quantity));
   }

    public List<CartItem> getItems() {
        return items;
    }
    public double getTotalAmount () {
       double total = 0;
       for (CartItem item : items){
           total+=item.totalPrice();
       }
       return total;
    }
    public List<String> generateReceipt() {
       List <String> receipt = new ArrayList<>();
       for (CartItem item:items){
           receipt.add("Общая сумма: "+String.format("%.2f", getTotalAmount()));
       }
       return receipt;
    }

}
