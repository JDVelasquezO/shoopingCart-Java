package app;

import app.PaymentInterface.PaymentInterface;
import app.list.List;

/**
 * ShoopingCart
 */
public class ShoopingCart {

    private List list;

    public ShoopingCart() {
        this.list = new List();
    }

    public void getItems() {
        for (int i = 0; i < list.getLength(); i++) {
            System.out.println(list.getItem(i));
        }
    }

    public void removeItems(Item item) {
        list.removeItem(item.getId());
    }

    public void addItems(Item item) {
        list.addItem(item);
    }

    public double calculateTotal() {
        double sum = 0;

        for (int i = 0; i < list.getLength(); i++) {
            sum += list.getItem(i).getPrice();
        }

        return sum;
    }

    public void pay(PaymentInterface paymentMethod) {
        double ammount = this.calculateTotal();
        paymentMethod.pay(ammount);
        System.out.println("Se ha pagado con " + paymentMethod);
    }
}