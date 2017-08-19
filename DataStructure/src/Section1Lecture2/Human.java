package Section1Lecture2;

/**
 * Created by himanshu.patwardhan on 19-Aug-17.
 */
public class Human {

    private String name;
    private int age;
    private int height;
    private String eyeColor;

    public Human() {
    }

    public Human(String name, int age, int height, String eyeColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, My name is "+this.getName());
        System.out.println("My age is "+this.getAge());
        System.out.println("My height is "+this.getHeight()+" cms");
        System.out.println("My eye color is "+this.getEyeColor());
    }

    public void walk(){

        System.out.println("Lets go for a walk !!");
    }

    public void eat(){

        System.out.println("Can we go out to eat something ?");
    }
}
