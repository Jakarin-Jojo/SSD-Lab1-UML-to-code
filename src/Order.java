import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(List<Product> products) {
        boolean alreadyHasOrderItem = false;

        for (Product product : products) {
            OrderItem currentOrderItem = new OrderItem(product, getNumberOfProduct(products, product));

            for (OrderItem orderItem : orderItems) {
                if (Objects.equals(product.getName(), orderItem.getProduct().getName())) {
                    alreadyHasOrderItem = true;
                    break;
                }
            }

            if (alreadyHasOrderItem) {
                alreadyHasOrderItem = false;
                continue;
            }
            orderItems.add(currentOrderItem);
        }
    }

    public int getNumberOfProduct(List<Product> products, Product target_product) {
        int total = 0;
        for (Product product : products) {
            if (Objects.equals(target_product.getName(), product.getName())) {
                total += 1;
            }
        }

        return total;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getTotal() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getSubTotal();
        }
        return total;
    }

    public double getTotalWithVat() {
        return getTotal() * 1.07;
    }
}
