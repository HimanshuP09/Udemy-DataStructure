package ds.linked_list;

/**
 * Created by himanshu.patwardhan on 25-Aug-17.
 */
public class Node {

    private int value;
    private Node next;
    private Node previous; //Used in doubly linked list

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
