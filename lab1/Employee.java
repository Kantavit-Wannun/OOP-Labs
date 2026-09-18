public class Employee {
    private String first_Name;
    private String last_Name;
    private double monthly_Salary;

    public Employee (String first_Name, String last_Name, double monthly_Salary){
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        if (monthly_Salary > 0) {
            this.monthly_Salary = monthly_Salary;
        } else {
            this.monthly_Salary = 0;
        }
    }

    public  Employee (String first_Name, String last_Name){
        this(first_Name, last_Name, 0);
    }

    public String getFirstname (){
        return first_Name;
    }

    public void setFirstname (String first_Name){
        this.first_Name = first_Name;
    }

    public String getLastname (){
        return last_Name;
    }

    public void setLastname (String last_Name){
        this.last_Name = last_Name;
    }

    public double getMonthlySalary(){
        return monthly_Salary;
    }
    public void setMonthlySalary (double monthly_Salary){
        if (monthly_Salary > 0) {
            this.monthly_Salary = monthly_Salary;
        }
    }
    public double getYearlySalary (){
        return monthly_Salary*12;
    }
    public void giveRaise() {
        monthly_Salary = monthly_Salary * 1.10;
    }

}
