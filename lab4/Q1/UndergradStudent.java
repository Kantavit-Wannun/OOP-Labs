package lab4.Q1;

public class UndergradStudent extends PSUStudent {
    protected int currentYear;

    public UndergradStudent(int age,double gpa){
        super(age, gpa);
        this.currentYear = 1;
    }

    public void setCurrentYear(int currentYear){
        this.currentYear = currentYear;
    }
    public double revealGrade(){
        if (currentYear >= 4) {
            return gpa;
        } else {
            return 0.0d;
        }
        
    }
}
