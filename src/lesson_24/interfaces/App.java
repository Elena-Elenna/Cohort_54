package lesson_24.interfaces;

public class App {
    public static void main(String[] args) {

        Printable book = new Book("JVM", "B.Eckell");
        book.print();


        //По ссылке типа интерфейс, я не могу вызвать метод класса,
        //которого нет в интерфейсе.
        //  book.uniqueMethod();
        //  Доступны методы Object
        System.out.println(book.toString());

        book.defaultMethod();
        Printable.staticMethod();

        //Не могу переопределить приватный метод.
//        @Override
//        void privateMrthod(){
//        }
        System.out.println("+++++++++++++++");
        Printable journal = new Journal("Cosmo", 12);
        journal.defaultMethod();
        journal.print();

        System.out.println("+++++++++++++++");
        ColorPrintable colorPrintable = new Presentation(
                "Inheritance",
                "Noname ",
                "OOP",
                20);
        colorPrintable.print();
        colorPrintable.colorPrint();
        colorPrintable.defaultMethod();

    }
}
