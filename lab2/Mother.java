package lab2;

public class Mother extends Parent{
    private Father husband;

    public Mother(){
        super(0);
    }
    @Override
    public String getFirstName() {
        return "Ms." + firstName;
    }

    public void setHusband(Father husband){
        this.husband = husband;
    }
    public Father getHusband(){
        return husband;
    }
}
