package Lesson.lesson_16;

public class MagicArray {
    int[] array;
    int cursor; // присвоено значение по умолчание - 0;

    public MagicArray() {
        array = new int[10];
    }

    // Добавление в массив одного элемента
    void add(int value) {
        if (cursor == array.length - 1) {         // Курсор указывает на последнюю свободную ячейку
            // Проверка. Есть ли свободное места во внутреннем массиве
            expandArray();                        // Если места нет - нужно добавить место
        }                                         // Расширить массив перед добавлением нового элемента
        array[cursor] = value;
        cursor++;
    }

    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! cursor: " + cursor);
        int[] newArray = new int[array.length * 2];  // 1.Создать массив большего размера (в 2 раза больше)
        for (int i = 0; i < cursor; i++) {           // 2.Переписать в новый массив все значения из старого (до курсора)
            newArray[i] = array[i];                  // Переписываю все значения из старого массива
        }
        array = newArray;                  // 3.Перебрасываем ссылку. Переменная array хранила ссылку на "новый" массив
        System.out.println("Расширение массива завершено");
    }

    // Добавление в массив нескольких элементов
    void addAll(int... values) {
        //System.out.println("Мы приняли несколько int-ов. А именно: " + values.length);
        // System.out.println("У каждого значения есть индекс. По индексом 0: " + values[0]);
        for (int i = 0; i < values.length; i++) {
            add(values[i]);                     // с values я могу обращаться точно также, как со ссылкой на массив int
        }
    }

    // Удаление элемента по индексу
    int remove(int index) {
        if (index < 0 || index >= cursor) {  //1.Проверить валидность индекса (что он не отрицательный и меньше курсора)
            return Integer.MIN_VALUE;                 // Индекс не валидный. Ничего в массиве не трогаем
        }
        int value = array[index];                      // 2.Запомнить, какое значение находилось под этим индексом
        for (int i = index; i <  cursor - 1; i++) {    //3.Удалить значение из ячейки
            array[i] = array[i + 1];                   //4.Передвинуть все элементы за индексом на 1 ячейку влево
        }
        cursor--;                                      //5. Передвинуть курсор влево
        return value;                                  //6.Вернуть старое значение
    }

    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";                       //Открыть скобочку.
        for (int i = 0; i < cursor; i++) {        //Перебрать элементы.
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");
            //Добавить каждый элемент, добавить запятую (если элемент не последний)
        }                                         //Закрыть скобочку
        return result;
    }

    //Поиск элемента по значению indexOf -(вернуть индекс, если такое значение есть в массиве)
    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //Возвращение значения по индексу
    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE;
    }

    //Удаление элемента по значению
    public boolean removeByValue(int value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }
}

/*
1. Добавлять в массив элементы (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы там есть) ++
4. Добавляем в массив сразу несколько значений ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу get(int index) ??
7. Удалять элемент по индексу (Если индекс есть - удалит элемент - вернет удаленное значение) ++
8. Поиск элемента по значению indexOf(int value) (определить есть ли в массиве элемент с таким значением) ??
9. Удалять элемент по значению boolean removeByValue(int value)
(Если значение есть - удалит элемент - вернет true, если такое значение было) ++
 */

