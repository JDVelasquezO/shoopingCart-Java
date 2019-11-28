package app;

/**
 * Item
 */
public class Item {

    private int id;
    private static int counter = 0;
    private char upcCode;
    private double price;

    public Item(char upcCode, double price) {
        this.id = counter;
        counter++;
        this.upcCode = upcCode;
        this.price = price;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the upcCode
     */
    public char getUpcCode() {
        return upcCode;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param upcCode the upcCode to set
     */
    public void setUpcCode(char upcCode) {
        this.upcCode = upcCode;
    }

    @Override
    public String toString() {
        return "Item " + getUpcCode();
    }
}