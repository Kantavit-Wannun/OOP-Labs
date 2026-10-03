package lab3;

public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule payment = new PaymentModule(0);

        Employee e1 = new Fulltimer("John", 30000);
        Employee e2 = new Manager("Mike", 40000, 5);
        Employee e3 = new Manager("Bob", 40000, 12);
        Employee e4 = new Hourly("Tom", 200, 100);

        payment.payment(e1);
        payment.payment(e2);
        payment.payment(e3);
        payment.payment(e4);

        System.out.println("Total Pay: " + payment.totalPay);
    }
}
