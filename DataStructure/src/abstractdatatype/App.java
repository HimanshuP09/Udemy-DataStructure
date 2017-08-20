package abstractdatatype;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by himanshu.patwardhan on 20-Aug-17.
 */
public class App {

    public static void main(String[] args) {

        Counter myCounter=new Counter("MyCounter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        System.out.println(myCounter.getCurrentValue());
        myCounter.increment();
        System.out.println(myCounter);
    }
}
