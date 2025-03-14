package Lesson.lesson_25.bankSystem;

public abstract class VusaMember implements PaymentSystem{
    private String carrency;

    private double courseBTS;
    protected String title;
    protected double balance;


    public VusaMember(String carrency, String title, double balance) {
        this.carrency = carrency;
        this.title = title;
        this.balance = balance;
        setActualBtcCourse(carrency);
    }


    @Override
    public boolean withdrawMoney(double amount) {
        if (amount > balance){
            System.out.println("Недостаточно средств для снятия" + amount);
            return false;
        }
        balance -= amount;
        System.out.printf("Успешно снято со счета %.2f %s.(Банк %s)\n",
                amount, this.getCarrency(), title);
        return true;
    }

    @Override
    public void depositTransfer(double amount) {
        System.out.println(title + "зачисляю на счет: " + amount
                + this.getCarrency());
        balance += amount;

    }

    @Override
    public double checkBalance() {
        return balance;
    }


    public double getCourseBTS() {
        return this.courseBTS;
    }

    public void setActualBtcCourse(String carrency){
        //Этод метод делает запрос на сервер платежной системы для получения актуального курса
        //и присвоения его в поле
        this.courseBTS = 100_000;
    }


    public String getCarrency() {
        return this.carrency;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getCurrency() {
        return this.carrency;
    }

    public void setCarrency(String carrency) {
        this.carrency = carrency;
    }
}
