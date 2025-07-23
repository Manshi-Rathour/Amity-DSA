package Oops;

public class BankClient {
    public static void main(String[] args) {
        BankDetails user = new BankDetails(10);

        user.name = "Abhi";
        System.out.println(user.checkBalance());

        user.deposit(100);
        System.out.println("User: " + user.name + ", Balance: " + user.checkBalance());
    }
}
