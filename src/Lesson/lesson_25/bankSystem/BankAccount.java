package Lesson.lesson_25.bankSystem;

public class BankAccount extends VusaMember{
    public BankAccount(String title, double balance) {
        super( "EUR", title, balance);
    }


    @Override
    public String toString() {
        return "BankAccount: { title: " + title + ", balance: " + balance
                + "; currency: " + this.getCarrency() +'}';
    }

//    @Override
//    public boolean withdrawMoney(double amount) {
//        if (amount > balance){
//            System.out.println("Недостаточно средств для снятия" + amount);
//             return false;
//        }
//        balance -= amount;
//        System.out.printf("Успешно снято со счета %.2f %s.(Банк %s)\n",
//                amount, this.getCarrency(), title);
//        return true;
//    }
//
//    @Override
//    public void depositTransfer(double amount) {
//        System.out.println(title + "зачисляю на счет: " + amount
//                           + this.getCarrency());
//
//    }
//
//    @Override
//    public double checkBalance() {
//        return balance;
//    }

    @Override
    public boolean transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > balance){
            System.out.printf("Недостаточно средств: (transfer: %.2f | balance: %.2f)\n",
                    amountEur, balance);
            return false;
        }
        if (recipient.getCurrency().equals("EUR")){ //Перевод евро на евровый счет
            balance -= amountEur;
            recipient.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод %.2f EUR (%s -> %s)\n",
                    amountEur,title,recipient.getTitle());
            return true;

        } else if(recipient.getCurrency().equals("BTC")){   //Конвертировать EUR -> BTC
            double amountBtc = amountEur / this.getCourseBTS();
            balance -= amountEur;
            recipient.depositTransfer(amountBtc);

            System.out.printf("Перевод %.2f EUR в %.7f BTC(%s -> %s)\n",
                    amountEur, amountBtc, title, recipient.getTitle());
            return true;
        }
        System.out.println("Что-то пошло не так с валютой счета получателя");
        return false;
    }
}
