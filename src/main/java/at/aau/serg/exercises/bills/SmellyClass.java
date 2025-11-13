package at.aau.serg.exercises.bills;

public class SmellyClass {

    private void addShippingItem(Order order, Double currentPrice) {
        // check for shipping costs
        if (currentPrice <= 100) {
            Item shippingItem = new Item();
            shippingItem.setId(99l);
            shippingItem.setName("Postage and Shipping");
            Double shippingPrice;
            if (currentPrice > 90) {
                shippingPrice = currentPrice * 0.05;
            } else if (currentPrice > 50) {
                shippingPrice = 7.5d;
            } else {
                shippingPrice = 10d;
            }

            shippingItem.setPrice(shippingPrice);
            order.getItems().add(shippingItem);
        }
    }
    private void printInvoice(Order order, Double finalPrice) {
        System.out.println("Bill:");
        for (Item item : order.getItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
        System.out.println("Total: " + finalPrice);
    }

    public void createInvoice(Order order) {

        //calculate temporary price
        Double initialPrice=order.calculateTotalPrice();
        //check for shipping costs
        addShippingItem(order, initialPrice);
        Double finalPrice =order.calculateTotalPrice();
        printInvoice(order, finalPrice);
    }
}
