package Control_Work_1.Task_2;

public class CartItem {
    private Product product;
    private int quantity;
    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;

    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    public double totalPrice () {
        return product.getPrice()*quantity;
    }
    public String toString (){
        return product.getName() + "Количество: "+quantity+", Итого: "+ String.format("%.2f", totalPrice());
    }
}
