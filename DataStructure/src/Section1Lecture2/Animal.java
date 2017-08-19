package Section1Lecture2;

/**
 * Created by himanshu.patwardhan on 20-Aug-17.
 */
public class Animal {

    private String name;
    private int age;
    private int weight;

    public Animal() {
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println(this.getName()+" is eating");
    }

    public void sleep(){

        System.out.println(this.getName()+" is sleeping");
    }
}
