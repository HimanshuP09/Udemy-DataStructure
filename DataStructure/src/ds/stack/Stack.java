package ds.stack;

/**
 * Created by himanshu.patwardhan on 20-Aug-17.
 */
public class Stack {

    private int maxLength;
    private long[] stackArray;
    private int top;

    public Stack(int maxLength){

        this.maxLength = maxLength;
        stackArray = new long[maxLength];
        top = -1;
    }

    public void push(long value){

        if(top!=maxLength-1){
            top+=1;
            stackArray[top]=value;
    }else{
            System.out.println("Stack is full !! no space to insert");
        }
    }

    public void pop(){

        if(top!=-1) {
            int oldTop = top;
            top -= 1;
            System.out.println("Value Popped was " + stackArray[oldTop]);
        }else{
            System.out.println("Stack is already empty !!");
        }
    }

    public void peak(){

        System.out.println("Current element on top of stack is "+stackArray[top]);
    }

    public boolean isEmpty(){

        return (top==-1);
    }

    public boolean isFull(){

        return (top==maxLength-1);
    }

    public void show(){

        for (int temp=top;temp>=0;temp--) {

            System.out.println(stackArray[temp]);
        }
    }
}
