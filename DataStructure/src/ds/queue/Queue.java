package ds.queue;

/**
 * Created by himanshu.patwardhan on 23-Aug-17.
 */
public class Queue {

    private int maxSize;
    private long[] queueArray;
    int first;
    int last;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new long[maxSize];
        this.first = -1;
        this.last = -1;
    }

    public void push(long value){

        last++;
        if(last < maxSize) {
            queueArray[last] = value;
            System.out.println("Element successfuly pushed into queue "+queueArray[last]);
            if(first == -1){
                first++;
            }
        }else {
            System.out.println("Queue is full");
            last--;
        }
    }

    public void pop(){

        if(first >= 0 && first <= last){
            System.out.println(queueArray[first] + " will be popped out");
            first++;
        }
        else{
            System.out.println("Queue is empty");
            first=-1;
            last=-1;

        }
    }

    public void peak(){
        if(first > -1) {
            System.out.println("First element is: " + queueArray[first]);
            System.out.println("Last element id: " + queueArray[last]);
        }
    }
}
