package homework_24.banking;

public class ElectronicWallet implements PaymentSystem {
    private String name;
    private double balance;
    private String currency;


    public ElectronicWallet(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.currency = "UA";
    }

    @Override
    public String toString() {
        return "ElectronicWallet {" +
                "name ='" + name + '\'' +
                ", balance =" + balance +
                ", currency ='" + currency + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCurrency() {
        return this.currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount < 0 || amount > balance){
            System.out.println("Операция не может быть выполнена");
            return;
        }
        System.out.println("Bank: " + name + " withdrawn sum: " + amount);
        balance -= amount;
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount < 0){
            System.out.println("Операция не может быть выполнена");
            return;
        }
        System.out.println("Bank: " + name + " deposit sum: " + amount);
        balance += amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
