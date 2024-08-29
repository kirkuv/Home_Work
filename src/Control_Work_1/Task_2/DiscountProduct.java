package Control_Work_1.Task_2;

public class DiscountProduct extends Product{

    private int discPerc;

    public DiscountProduct(String name, double originalPrice, int discPerc) {
        super(name,originalPrice);
        this.discPerc = discPerc;
    }
    public double getDiscPrice() {
        return discPerc;
    }
    @Override
    public double getPrice() {
        return (getPrice() * (100-discPerc/100));
    }
    public String toString (){
        return String.format("%s, Цена - %.2f, Скидка - %.0f%%",getName(), getPrice(), discPerc);
    }
}