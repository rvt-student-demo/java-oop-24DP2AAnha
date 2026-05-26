package rvt.Online_shop;

public class Shop_item {
  private String product;
    private int qty;
    private int unitPrice;

    public Shop_item(String product, int qty, int unitPrice) {
        //create the item
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public String toString() {
        return product + ": " + qty;
    }
}
