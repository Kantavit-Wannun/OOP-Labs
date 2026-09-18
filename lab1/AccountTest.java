public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Max", 5000);

        System.out.println("Name: " +account.getName());
        System.out.println("Balance: " +account.getBalance());

        System.out.println("Depositing");
        account.deposit(500);
        System.out.println("Balance: " +account.getBalance());
    }
}
