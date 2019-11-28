package app.PaymentInterface;

/**
 * PaypalPayment
 */
public class PaypalPayment implements PaymentInterface {

    private String email;
    private char password;

    public PaypalPayment(String email, char password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double ammount) {
        System.out.println("Se pagó " + ammount + " con Paypal en " + this.email);
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the password
     */
    public char getPassword() {
        return password;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(char password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Se pago con paypal de " + getEmail();
    }
}