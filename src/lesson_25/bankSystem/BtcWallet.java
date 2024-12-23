package lesson_25.bankSystem;

public class BtcWallet extends VusaMember{
    public BtcWallet(String title, double balance) {
        super("BTC", title, balance);
    }

    @Override
    public String toString() {
        return "BtcWallet{" +
                "title='" + title + '\'' +
                ", balance=" + balance + "; currency: " + getCarrency() +
                '}';
    }

    @Override
    public boolean transferMoney(double amountBtc, PaymentSystem recipient) {
        if (amountBtc > balance){
            System.out.printf("Недостаточно средств: (transfer: %.2f | balance: %.2f)\n",
                    amountBtc, balance);
            return false;
        }
        if (recipient.getCurrency().equals("BTC")) { //Перевод  BTC -> BTC счет
            balance -= amountBtc;
            recipient.depositTransfer(amountBtc);
            System.out.printf("Успех! Перевод %.2f BTC (%s -> %s)\n",
                    amountBtc,title, recipient.getTitle());
            return true;
        } else if (recipient.getCurrency().equals("EUR")){   //Конвертировать BTC -> EUR
            double amountEur = amountBtc * this.getCourseBTS();
            balance -= amountBtc;
            recipient.depositTransfer(amountEur);

            System.out.printf("Перевод %.7f BTC в %.2f EUR(%s -> %s)\n",
                    amountBtc, amountEur, title, recipient.getTitle());
            return true;
        }
        System.out.println("Что-то пошло не так с валютой счета получателя");
        return false;
    }

}
