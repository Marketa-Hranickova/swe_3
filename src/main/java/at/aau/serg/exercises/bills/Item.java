package at.aau.serg.exercises.bills;

public class Item {
    private Long id;
    private Double price;
    private String name;

    public Item(Long id, Double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    public Double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

}
