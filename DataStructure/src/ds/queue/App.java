package ds.queue;

/**
 * Created by himanshu.patwardhan on 23-Aug-17.
 */
public class App {

    public static void main(String[] args) {

        Queue myQueue = new Queue(3);
        myQueue.push(111);
        myQueue.push(222);
        myQueue.push(224);
        myQueue.push(333);
        myQueue.peak();
        myQueue.push(300);
        myQueue.peak();
        myQueue.push(490);
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        myQueue.push(123);
        myQueue.peak();
    }
}
