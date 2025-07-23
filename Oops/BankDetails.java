package Oops;

public class BankDetails {
    String name;
    private int amt;

    public BankDetails(int a){
        amt = a;
    }
    public void deposit(int amount){
        amt = amt + amount;
    }
    public int checkBalance(){
        return amt;
    }
}
