package lesson_25.bankSystem;
/*
Task 2
Платежные системы. Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.

Опционально. Добавить в интерфейс метод:
transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */

public class App {
    public static void main(String[] args) {

        PaymentSystem bank = new BankAccount("AB ",50000);
        System.out.println(bank.withdrawMoney(1000));
        System.out.println(bank);

        System.out.println(bank.withdrawMoney(100000));
        System.out.println(bank);

        System.out.println("+++++++++++++++++++");

        PaymentSystem bank1 = new BankAccount("VB ", 10000);
        bank.transferMoney(14000, bank1);
        System.out.println(bank);
        System.out.println(bank1);

        System.out.println("++++++++++++++++++++++");

        PaymentSystem wallet = new BtcWallet("Cripto ", 3);
        System.out.println(wallet);

        wallet.transferMoney(1,bank1);

        System.out.println(bank1);
        System.out.println(wallet);
        System.out.println("+++++++++++++");

        bank.transferMoney(30000,wallet);
        System.out.println(bank);
        System.out.println(wallet);
    }
}
