public class EmployeeTest {
    public static void main(String[] args){
        Employee employee = new Employee("John", "Doe", 50000);

        System.out.println("First name: " +employee.getFirstname());
        System.out.println("Last name: " +employee.getLastname());
        System.out.println("Monthly Salary: " +employee.getMonthlySalary());
        
        System.out.println();
        employee.setFirstname("Mike");
        employee.setLastname("Johnson");
        employee.setMonthlySalary(35000);
        System.out.println("First name: " +employee.getFirstname());
        System.out.println("Last name: " +employee.getLastname());
        System.out.println("Monthly Salary: " +employee.getMonthlySalary());

        employee.setMonthlySalary(-5000);
        System.out.println("After setting negative salary: " +employee.getMonthlySalary());

        System.out.println();
        Employee employee1 = new Employee("Peter", "Parker", 10000);
        Employee employee2 = new Employee("Tony", "Stark", 60000);
        
        System.out.println("Yearly Salary");
        System.out.println(employee1.getFirstname()+ " " +employee1.getLastname()+ " : " +employee1.getYearlySalary());
        System.out.println(employee2.getFirstname()+ " " +employee2.getLastname()+ " : " +employee2.getYearlySalary());
        System.out.println();
        System.out.println("After 10% Raise: ");
        employee1.giveRaise();
        employee2.giveRaise();
        System.out.println(employee1.getFirstname()+ " " +employee1.getLastname()+ " : " +employee1.getYearlySalary());
        System.out.println(employee2.getFirstname()+ " " +employee2.getLastname()+ " : " +employee2.getYearlySalary());
    }
}
