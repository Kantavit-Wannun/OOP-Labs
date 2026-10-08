package lab4.Q1;

public class GradStudent extends PSUStudent {
    protected boolean passThesis;

    public GradStudent(int age,double gpa){
        super(age, gpa);
        this.passThesis = false;
    }

    public void setPassThesis(boolean passThesis){
        this.passThesis = passThesis;
    }
    public double revealGrade(){
        if (passThesis == true) {
            return gpa;
        } else {
            return 0.0d;
        }
    }
}
