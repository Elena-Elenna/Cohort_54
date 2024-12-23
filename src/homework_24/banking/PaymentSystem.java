package homework_24.banking;

public interface PaymentSystem {
    void withdrawMoney(double amount);  //снятие со счета

    void depositTransfer(double amount);  //поступление денег на счет

    double checkBalance(); //остаток на счете

}
