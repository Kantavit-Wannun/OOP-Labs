package lab4.Q1;

public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age,double gpa) throws IllegalArgumentException {
        this.age = age;
        this.gpa = gpa;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setCurrentYear(int currentYear) {}
    public void setPassThesis(boolean passThesis) {}
    public abstract double revealGrade();
    
}
