package lists;

public class MyArray {
    private int[] array;
    private int cursor; // присвоено значение по умолчание - 0;


    public MyArray() {
        array = new int[10];
    }


    // 0. Конструктор, который принимает обычный массив и создает MagicArray с такими же значениями

    public MyArray(int[] ints) {
        if (ints != null) {
            this.array = new int[ints.length * 2];
            addAll(ints);
        } else {
            this.array = new int[10];
        }
    }


    // 1. Добавление в массив одного элемента

    public void add(int value) {
        if (cursor == array.length - 1) {

            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }
    /*
    Курсор указывает на последнюю свободную ячейку
    Проверка. Есть ли свободное места во внутреннем массиве
    Если места нет - нужно добавить место
    Расширить массив перед добавлением нового элемента
     */




    // 2. Динамическое расширение массива

    private void expandArray() {
        System.out.println("Расширяем массив! cursor: " + cursor);
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Расширение массива завершено");
    }
    /*
    1.Создать массив большего размера (в 2 раза больше).Переписываю все значения из старого массива
    2.Переписать в новый массив все значения из старого (до курсора)
    3.Перебрасываем ссылку. Переменная array хранила ссылку на "новый" массив
     */


    // 3. Добавление в массив нескольких элементов

    public void addAll(int... values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }
    /*
    с values я могу обращаться точно также, как со ссылкой на массив int
     */


    // 4. Удаление элемента по индексу

    public int remove(int index) {
        if (index < 0 || index >= cursor) {
            return Integer.MIN_VALUE;
        }
        int value = array[index];
        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;
        return value;
    }
    /*
    1.Проверить валидность индекса (что он не отрицательный и меньше курсора)
       Индекс не валидный. Ничего в массиве не трогаем
    2.Запомнить, какое значение находилось под этим индексом
    3.Удалить значение из ячейки
    4.Передвинуть все элементы за индексом на 1 ячейку влево
    5. Передвинуть курсор влево
    6.Вернуть старое значение
     */


    // 5. Текущее количество элементов в массиве

    public int size() {
        return cursor;
    }


    // 6. Возвращает строковое представление массива

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");

        }
        return result;
    }
    /*
    Открыть скобочку.
    Перебрать элементы.
    Добавить каждый элемент, добавить запятую (если элемент не последний)
    Закрыть скобочку
     */


    // 7. Поиск элемента по значению indexOf - находит индекс первого вхождения

    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    /*
    (вернуть индекс, если такое значение есть в массиве)
     */


    // 8. Поиск элемента по значению lastIndexOf - находит индекс последнего вхождения

    public int lastIndexOf(int value){
        for (int i = cursor - 1; i >= 0; i--){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }


    // 9. Возвращение значения по индексу

    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE;
    }


    // 10. Метод, который возвращает все значения в виде обычного массива

    public int[] toArray() {
        int[] newArr = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }


    // 11. Удаление элемента по значению

    public boolean removeByValue(int value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }


    // 12. Замена значения по индексу (есть индекс и новое значение) - возвращает старое значение

    public int set(int index, int newValue) {

        if (index < 0 || index >= cursor) {
            return Integer.MIN_VALUE;
        }
        int oldValue = array[index];
        array[index] = newValue;
        return oldValue;
    }

    /*
    Валидация индекса 0....cursor
    Вытащить старое значение - запомнить
    Записать новое значение
    Вернуть старое значение
     */

}
