package lab3;

public class AdvancedPaymentModule extends PaymentModule {
    public AdvancedPaymentModule(double totalPay) {
        super(totalPay);
    }
    
    public void payment(Employee[] e){
        for (int i = 0; i < e.length; i++) {
            super.payment(e[i]);
        }
    }
}
