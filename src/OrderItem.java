public class OrderItem {
    private int quantity;
    private Product product;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getSubTotal() {
        return product.getPrice() * quantity;
    }
}
