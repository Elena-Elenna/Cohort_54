package Home_Work.homework_25.magicArray;

public class MagicArrayHW25 <T>{
    private T[] array;
    private int cursor;        // присвоено значение по умолчание - 0;



    public MagicArrayHW25() {
        array =(T[]) new Object[10];
    }


    public MagicArrayHW25(T[] ints) {
        if (ints != null) {
            this.array =(T[]) new Object[ints.length * 2];
            addAll(ints);
        } else {
            this.array =(T[]) new Object[10];
        }
    }



    // 1. Добавление в массив одного элемента

    public void add(T value) {
        if (cursor == array.length - 1) {         // Курсор указывает на последнюю свободную ячейку
            // Проверка. Есть ли свободное места во внутреннем массиве
            expandArray();                        // Если места нет - нужно добавить место
        }                                         // Расширить массив перед добавлением нового элемента
        array[cursor] = value;
        cursor++;
    }

    // 2. Динамическое расширение массива

    private void expandArray() {
        System.out.println("Расширяем массив! cursor: " + cursor);
        T[] newArray = (T[]) new Object[array.length * 2];  // 1.Создать массив большего размера (в 2 раза больше)
        for (int i = 0; i < cursor; i++) {                  // 2.Переписать в новый массив все значения из старого (до курсора)
            newArray[i] = array[i];                         // Переписываю все значения из старого массива
        }
        array = newArray;                                   // 3.Перебрасываем ссылку. Переменная array хранила ссылку на "новый" массив
        System.out.println("Расширение массива завершено");
    }

    // 3. Добавление в массив нескольких элементов

    public void addAll(T... values) {

        for (int i = 0; i < values.length; i++) {
            add(values[i]);                     // с values я могу обращаться точно также, как со ссылкой на массив int
        }
    }

    // 4. Удаление элемента по индексу

    public T remove(int index) {
        if (index < 0 || index >= cursor) {            //1.Проверить валидность индекса (что он не отрицательный и меньше курсора)
            return null;                               // Индекс не валидный. Ничего в массиве не трогаем
        }
        T value = array[index];                        // 2.Запомнить, какое значение находилось под этим индексом
        for (int i = index; i < cursor - 1; i++) {     //3.Удалить значение из ячейки
            array[i] = array[i + 1];                   //4.Передвинуть все элементы за индексом на 1 ячейку влево
        }
        cursor--;                                      //5. Передвинуть курсор влево
        return value;                                  //6.Вернуть старое значение
    }

    // 5. Текущее количество элементов в массиве

    public int size() {
        return cursor;
    }

    // 6. Возвращает строковое представление массива

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";                                             //Открыть скобочку.
        for (int i = 0; i < cursor; i++) {                               //Перебрать элементы.
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");
            //Добавить каждый элемент, добавить запятую (если элемент не последний)
        }                                                                 //Закрыть скобочку
        return result;
    }

    // 7. Поиск элемента по значению indexOf - находит индекс первого вхождения

    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;                     // (вернуть индекс, если такое значение есть в массиве)
            }
        }
        return -1;
    }

    // 8. Поиск элемента по значению lastIndexOf - находит индекс последнего вхождения

    public int lastIndexOf(T value){
        for (int i = cursor - 1; i >= 0; i--){
            if (array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }


    // 9. Возвращение значения по индексу

    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }

    // 10. Метод, который возвращает все значения в виде обычного массива

    public T[] toArray() {
        T[] newArr = (T[]) new Object[cursor];
        for (int i = 0; i < cursor; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

    // 11. Удаление элемента по значению

    public boolean removeByValue(T value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    // 12. Замена значения по индексу (есть индекс и новое значение) - возвращает старое значение

    public T set(int index, T newValue) {

        if (index < 0 || index >= cursor) {               //Валидация индекса 0....cursor
            return null;

        }
        T oldValue = array[index];                      //Вытащить старое значение - запомнить
        array[index] = newValue;                         //Записать новое значение
        return oldValue;                                 //Вернуть старое значение
    }
}

/*
1. Добавлять в массив элементы (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы там есть) ++
4. Добавляем в массив сразу несколько значений ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу get(int index) ++
7. Удалять элемент по индексу (Если индекс есть - удалит элемент - вернет удаленное значение) ++
8. Поиск элемента по значению indexOf(int value) (определить есть ли в массиве элемент с таким значением) ++
9. Удалять элемент по значению boolean removeByValue(int value)
(Если значение есть - удалит элемент - вернет true, если такое значение было) ++

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

10. Поиск последнего вхождения по значению lastIndexOf ++
11. Замена значения по индексу (есть индекс и новое значение) - возвращает старое значение++
12. Конструктор, который принимает обычный массив и создает MagicArray с такими же значениями++
13. Метод, который возвращает все значения в виде обычного массива ++
 */

