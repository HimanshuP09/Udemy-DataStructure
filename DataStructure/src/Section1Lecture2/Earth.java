package Section1Lecture2;

/**
 * Created by himanshu.patwardhan on 19-Aug-17.
 */
public class Earth {

    public static void main(String[] args) {

        Human jack=new Human();
        jack.setName("Jack");
        jack.setAge(24);
        jack.setHeight(180);
        jack.setEyeColor("Blue");

        jack.speak();
        jack.eat();
        jack.walk();
    }
}
