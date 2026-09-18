public class EmployeeTeamTest{
    public static void main(String[] args) {
        Employee boss = new Employee("John", "Doe" , 50000); 
        Employee employee = new Employee("Mike", "Johnson" , 35000);

        EmployeeTeam team = new EmployeeTeam(boss, employee);

        System.out.println("Employee Details");
        team.printEmployeeDetails();
        System.out.println();
        System.out.println("All Employees Details");
        team.printAllEmployeesDetails();
        System.out.println();

        team.updateSalaryOfEmployee("Mike", 40000);

        System.out.println("After Updateing Mike's Salary");
        team.printAllEmployeesDetails();

        System.out.println();
        team.giveRiseToAllEmployees();
        
        System.out.println("After 10% Raise");
        team.printAllEmployeesDetails();
    }
}