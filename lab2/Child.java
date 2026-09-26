package lab2;

public class Child extends Person {
    private int age;
    private int height;
    private double weight;
    private Person guardian;

    public Child(int age,int height,double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
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
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setGuardian(Person guardian){
        this.guardian = guardian;
    }
    public Person getGuardian(){
        return guardian;
    }
}
