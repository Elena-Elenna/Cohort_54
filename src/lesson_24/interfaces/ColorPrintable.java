package lesson_24.interfaces;
//Интерфейс может расширять другой интерфейс(для расширения используется extends
//Дочерний интерфейс наследует все методы родительского интерфейса.

public interface ColorPrintable extends Printable{
    void colorPrint();
}
