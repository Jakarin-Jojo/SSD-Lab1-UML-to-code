import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phone;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void purchase(List<Product> products) {
        this.orders.add(new Order(products));
    }
}
