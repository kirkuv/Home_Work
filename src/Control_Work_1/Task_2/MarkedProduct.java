package Control_Work_1.Task_2;

public class MarkedProduct extends DiscountProduct{
    private String markedProductReason;
    public MarkedProduct (String name, double origPrice, int discPerc, String markedProductReason){
        super(name, origPrice, discPerc);
        this.markedProductReason = markedProductReason;
    }

    public String getMarkedProductReason() {
        return markedProductReason;
    }
    public String toString (){
        return String.format("%s, Цена - %.2f, Скидка - %.0f%%, Уценка - %s",getName(), getPrice(), getDiscPrice(),markedProductReason);
    }
}
