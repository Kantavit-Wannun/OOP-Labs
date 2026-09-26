package lab2;

public class Parent extends Person {
    protected Child child;
    protected int money;

    public Parent(int money){
        this.money = money;
    }
    public void setChild(Child child){
        this.child = child;
    }
    public Child getChild(){
        return child;
    }
}
