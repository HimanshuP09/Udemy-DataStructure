package Section1Lecture2;

/**
 * Created by himanshu.patwardhan on 20-Aug-17.
 */
public class Zoo {

    public static void main(String[] args) {

        Animal tiger=new Animal("Tiger",10,100);
        Animal elephant= new Animal("Elephant",50,800);

        tiger.eat();
        elephant.sleep();
    }
}
