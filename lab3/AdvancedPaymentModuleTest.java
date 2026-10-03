package lab3;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        Employee e1 = new Fulltimer("John", 30000);
        Employee e2 = new Manager("Mike", 40000, 5);
        Employee e3 = new Manager("Bob", 40000, 12);
        Employee e4 = new Hourly("Tom", 200, 100);

        Employee[] employees = {e1, e2, e3, e4};

        AdvancedPaymentModule payment = new AdvancedPaymentModule(0);

        payment.payment(employees);

        System.out.println("Total Pay = " +payment.totalPay);
    }
}
