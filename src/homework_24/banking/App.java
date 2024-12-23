package homework_24.banking;
/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */

public class App {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("BTS", 20000);
        System.out.println(bank.toString());

        bank.withdrawMoney(2000000);
        bank.depositTransfer(500);
        System.out.println("Balance: " + bank.checkBalance());
        System.out.println("+++++++++++++++++++++++++++++++++++");

        ElectronicWallet wallet = new ElectronicWallet("ATB", 10000);
        System.out.println(wallet.toString());

        wallet.withdrawMoney(1000000);
        wallet.withdrawMoney(100);
        wallet.depositTransfer(-111);
        wallet.depositTransfer(111);
        System.out.println("Balance: " + wallet.checkBalance());

    }
}
