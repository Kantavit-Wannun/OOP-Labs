package lab4.Q2;

public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age,double gpa) throws IllegalArgumentException {
        this.age = age;
        this.gpa = gpa;
        if (age < 0 || gpa < 0.0 || gpa > 4.0) throw new IllegalArgumentException();
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
