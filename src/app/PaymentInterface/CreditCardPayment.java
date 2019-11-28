package app.PaymentInterface;

import java.util.Date;

/**
 * CreditCardPayment
 */
public class CreditCardPayment implements PaymentInterface {

    private String name;
    private char cardNumber;
    private int cvv;
    private Date dateOfExpiry;

    public CreditCardPayment(String name, char cardNumber, int cvv, Date date) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = date;
    }

    @Override
    public void pay(double ammount) {
        System.out.println("Se pagó " + ammount + " con tarjeta de crédito " + this.name);
    }

    /**
     * @return the cardNumber
     */
    public char getCardNumber() {
        return cardNumber;
    }

    /**
     * @return the cvv
     */
    public int getCvv() {
        return cvv;
    }

    /**
     * @return the dateOfExpiry
     */
    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(char cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @param cvv the cvv to set
     */
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    /**
     * @param dateOfExpiry the dateOfExpiry to set
     */
    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tarjeta de credito de nombre " + getName();
    }
}