package ds.linked_list;

/**
 * Created by himanshu.patwardhan on 25-Aug-17.
 */
public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        head=null;
        tail=null;
    }
    public void addToHead(int value){
        Node temp=new Node();
        temp.setValue(value);
        temp.setNext(null);
        if(head==null){
            head=temp;
            tail=head;
        }else{
            temp.setNext(head);
            head=temp;
        }
    }
    public void addToTail(int value){
        Node temp=new Node();
        temp.setValue(value);
        temp.setNext(null);
        if(head == null){
            head = temp;
            tail = head;
        }else{
            tail.setNext(temp);
            tail = temp;
        }
    }

    public void addToIndexPosition(int index,int value){
        Node current=new Node();
        current.setValue(value);
        Node temp = head;
        for(int i = 1;i < index-1;i++){
            temp=temp.getNext();
        }
        current.setNext(temp.getNext());
        temp.setNext(current);
    }

    public void deleteFromHead(){
        System.out.println(head.getValue()+" will be deleted");
        head=head.getNext();
    }

    public void deleteToIndexPosition(int index){
        Node temp = head;
        for(int i = 1;i < index-1;i++){
            temp=temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
    }

    public void show(){
        Node temp=head;
        System.out.println("_______________________________________________________");
       do{
            System.out.println(temp.getValue());
            temp=temp.getNext();
        } while (temp!=null);
        System.out.println("_______________________________________________________");

    }

    public int listLengthFromGivenNodeIndex(int index){
        int length=0;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.getNext();
        }
        while (temp!=null){
            length++;
            temp=temp.getNext();
        }
        return length;
    }
}
