package lab3;

public class PaymentModule {
    protected double totalPay;

    public PaymentModule(double t){
        totalPay = t;
    }

    public void payment(Employee e){
        double pay = e.computePay();
        if (e instanceof Manager) {
            Manager manager = (Manager) e;
            if (manager.getWorkYear() > 10) {
                pay = pay * 2;
            }
        }

        totalPay = totalPay + pay;
    }

}
