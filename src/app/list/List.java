package app.list;

import app.Item;

/**
 * List
 */
public class List {

    private Node start;
    private int length;

    public List() {
        start = null;
        length = 0;
    }

    public void addItem(Item item) {
        Node node = new Node(item);
        if (isEmpty()) {
            start = node;
        } else {
            Node pointer = start;

            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }

            pointer.setNext(node);
        }

        length++;
    }

    public Item getItem(int n) {
        Node pointer = start;
        int counter = 0;

        while (pointer.getNext() != null && counter < n) {
            pointer = pointer.getNext();
            counter++;
        }

        return pointer.getItem();
    }

    public void removeItem(int n) {
        if (n == 0) {
            Node fisrt = start;
            start = start.getNext();
            fisrt.setNext(null);
        } else {
            Node pointer = start;
            int counter = 0;

            while (counter < (n - 1)) {
                pointer = pointer.getNext();
                counter++;
            }

            Node temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
        }

        length--;
    }

    public boolean isEmpty() {
        return start == null;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }
}