package app;

import java.util.Date;

import app.PaymentInterface.CreditCardPayment;

public class App {
    public static void main(String[] args) throws Exception {
        Item item = new Item('C', 1200);
        Item item2 = new Item('A', 1300);
        Item item3 = new Item('B', 1300);
        Item item4 = new Item('F', 1300);
        ShoopingCart shoopingCart = new ShoopingCart();
        Date date = new Date();
        CreditCardPayment creditCardPayment = new CreditCardPayment("DANIEL", 'A', 456, date);

        shoopingCart.addItems(item);
        shoopingCart.addItems(item2);
        shoopingCart.addItems(item3);
        shoopingCart.addItems(item4);

        shoopingCart.removeItems(item3);

        shoopingCart.getItems();
        System.out.println("Total a pagar: Q." + shoopingCart.calculateTotal());
        shoopingCart.pay(creditCardPayment);
    }
}
