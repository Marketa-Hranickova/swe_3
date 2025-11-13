package at.aau.serg.exercises.bills;

import java.util.List;

public class Order {

    private Long id;
    private Customer customer;
    private List<Item> items;

    public Double calculateTotalPrice() {
        Double totalPrice = 0.0d;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public Order(Long id, Customer customer, List<Item> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
    }

    public Long getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public List<Item> getItems() {
        return items;
    }

}
