package Consultation.consultation_11.bookstore;

public class BookApp {
    public static void main(String[] args) {
        // Создаем объект konanDoyl (экземпляр класса Author)
        Author konanDoyl = new Author("А́ртур Ко́нан Дойл");

        // Создаем объект book1 (экземпляр класса Book)
        Book book1 = new Book("Этюд в багровых тонах");
//        System.out.println(book1.getTitle());
//        System.out.println(book1.getAuthor());
        book1.setAuthor(konanDoyl);     // устанавливаем автора для книги1
//        System.out.println("====================");
//        System.out.println(book1.getTitle());
//        System.out.println(book1.getAuthor().getName());
        // Создаем объект book2 (экземпляр класса Book)
        Book book2 = new Book("Знак четырёх");
        book2.setAuthor(konanDoyl);     // устанавливаем автора для книги2

        // Создаем объект book3 (экземпляр класса Book)
        Book book3 = new Book("Приключения Шерлока Холмса");
        book3.setAuthor(konanDoyl);     // устанавливаем автора для книги3

        // Создаем объект book4 (экземпляр класса Book)
        Book book4 = new Book("Записки о Шерлоке Холмсе");
        book4.setAuthor(konanDoyl);     // устанавливаем автора для книги4

        System.out.println(book1.getTitle() + ", " + book1.getAuthor().getName());
        System.out.println();

        // Добавляем книги объекту автора
        konanDoyl.addBook(book1);
        System.out.println(konanDoyl.getInfo());
        System.out.println("======== Добавляем книгу автору " + konanDoyl.getName() + " ========");
        konanDoyl.addBook(book2);
        System.out.println(konanDoyl.getInfo());
        System.out.println("======== Добавляем книгу автору " + konanDoyl.getName() + " ========");
        konanDoyl.addBook(book3);
        System.out.println(konanDoyl.getInfo());
        System.out.println("======== Добавляем книгу автору " + konanDoyl.getName() + " ========");
        konanDoyl.addBook(book4);
        System.out.println(konanDoyl.getInfo());

        // Создаем массив книг (только с наименованием)
        Book[] newList = {
                new Book("Таинственное происшествие в Стайлз"),
                new Book("Человек в коричневом костюме"),
                new Book("Тайна «Голубого экспресса»")
        };

        // Создаем объект agataKristi (экземпляр класса Author)
        Author agataKristi = new Author(
                "Агата Кристи",
                newList
        );

        // Выводим в консоль информацию о объекте agataKristi
        System.out.println();
        System.out.println(agataKristi.getInfo());
        System.out.println();

        // Еще один способ добавления новой книги автору
        agataKristi.addBook(new Book("Тринадцать сотрапезников"));
        System.out.println(agataKristi.getInfo());

        // Дополнительные варианты работы с массивами объектов
        System.out.println();
        System.out.println(newList[0].getInfo());
        System.out.println("======== Добавляем автора к книге " + agataKristi.getName() + " ========");
        newList[0].setAuthor(agataKristi);
        System.out.println(newList[0].getInfo());
    }
}
