package ds.stack;

/**
 * Created by himanshu.patwardhan on 20-Aug-17.
 */
public class App {

    public static void main(String[] args) {

        Stack myStack=new Stack(10);

        myStack.push(101);
        myStack.push(102);
        myStack.push(103);
        myStack.push(104);
        myStack.push(105);

        System.out.println("Is stack empty: "+myStack.isEmpty());
        System.out.println("Is stack full: "+myStack.isEmpty());
        myStack.peak();
        myStack.pop();
        myStack.peak();
        myStack.show();
    }
}
