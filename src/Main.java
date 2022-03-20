import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jakarin", "0000000000");
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Pen", 10));
        products.add(new Product("Pen", 10));
        products.add(new Product("Mac", 60000));
        products.add(new Product("Mac", 60000));
        customer.purchase(products);
        // Customer name "Jakarin " has 1 order
        System.out.println("Order of "+customer.getName() + " is " + customer.getOrders());
        //Show the total with a vat of Jakarin for this order.
        for (Order order: customer.getOrders()){
            System.out.println(order.getTotalWithVat());
        }

        Customer customer2 = new Customer("Poomtum", "0123456789");
        List<Product> ListProduct1 = new ArrayList<Product>();
        ListProduct1.add(new Product("ruler",20));
        ListProduct1.add(new Product("Coke",18));
        ListProduct1.add(new Product("Hamburger",200));
        customer2.purchase(ListProduct1);
        // Customer name "Poomtum " has 1 order
        System.out.println("Order of "+customer2.getName() + " is " + customer2.getOrders());
        //Show the total with a vat of Poomtum for this order.
        for (Order order: customer2.getOrders()){
            System.out.println(order.getTotalWithVat());
        }
    }
}
