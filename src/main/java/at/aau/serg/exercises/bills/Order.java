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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
