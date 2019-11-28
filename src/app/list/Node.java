package app.list;

import app.Item;

/**
 * Node
 */
public class Node {

    private Node next;
    private Item item;

    public Node(Node next, Item item) {
        this.next = next;
        this.item = item;
    }

    public Node(Item item) {
        this(null, item);
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }
}