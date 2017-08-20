package abstractdatatype;

/**
 * Created by himanshu.patwardhan on 20-Aug-17.
 */
public class Counter {

    private int value=0;
    private String name=null;
    public Counter() {
    }

    public Counter(String name) {
        this.name = name;
    }

    public void increment(){
        value+=1;
    }
    public int getCurrentValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return "Counter Value = " + value;
    }
}
