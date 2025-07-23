package Oops;

public class Client {
    public static void main(String[] args) {
        Seller s = new Seller();
        Seller s1 = new Seller("Tv");
        Seller s2 = new Seller("Phone", 10000, "Patna");

        System.out.println("Product: " + s2.product + ", Price: " + s2.price + ", Location: " + s2.location);
    }
}
