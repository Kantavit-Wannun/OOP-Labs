public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss,Employee employee){
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployeeDetails(){
        System.out.println("First name: "+employee.getFirstname());
        System.out.println("Last name: "+employee.getLastname());
        System.out.println("Salary: "+employee.getMonthlySalary());
    }

    public void printAllEmployeesDetails(){
        System.out.println("--- Boss ---");
        System.out.println("First name: " +boss.getFirstname());
        System.out.println("Last name: " +boss.getLastname());
        System.out.println("Salary: " +boss.getMonthlySalary());
        System.out.println();
        System.out.println("--- Employee ---");
        System.out.println("First name: "+employee.getFirstname());
        System.out.println("Last name: "+employee.getLastname());
        System.out.println("Salary: "+employee.getMonthlySalary());
    }

    public void updateSalaryOfEmployee(String firstname,double newSalary){
        if (newSalary > 0) {
            if (boss.getFirstname().equals(firstname)) {
                boss.setMonthlySalary(newSalary);;
            }

            if (employee.getFirstname().equals(firstname)) {
                employee.setMonthlySalary(newSalary);
            }
        }
    }

    public void giveRiseToAllEmployees(){
        boss.giveRaise();
        employee.giveRaise();
    }
}
