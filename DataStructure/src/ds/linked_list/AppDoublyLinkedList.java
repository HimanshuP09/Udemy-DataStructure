package ds.linked_list;

/**
 * Created by himanshu.patwardhan on 25-Aug-17.
 */
public class AppDoublyLinkedList {

    public static void main(String[] args) {

        DoublyLinkedList myLinkedList = new DoublyLinkedList();
        myLinkedList.addToHead(1);
        myLinkedList.addToTail(2);
        myLinkedList.addToTail(3);
        myLinkedList.addToHead(0);
        myLinkedList.show();
        myLinkedList.deleteFromHead();
        myLinkedList.deleteFromHead();
        myLinkedList.show();
        myLinkedList.addToTail(5);
        myLinkedList.addToHead(6);
        myLinkedList.addToIndexPosition(3,55);
        myLinkedList.show();
        myLinkedList.deleteToIndexPosition(4);
        myLinkedList.show();
        System.out.println("Length from index 1: "+myLinkedList.listLengthFromGivenNodeIndex(1));
        System.out.println("Length from index 3: "+myLinkedList.listLengthFromGivenNodeIndex(3));
        System.out.println("Length from index 4: "+myLinkedList.listLengthFromGivenNodeIndex(4));
        System.out.println("Length from index 0: "+myLinkedList.listLengthFromGivenNodeIndex(0));

    }
}

