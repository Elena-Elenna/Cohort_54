package utils;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyArrayList <T> implements MyList<T> {
    private T[] array;
    private int cursor;        // присвоено значение по умолчание - 0;


    public MyArrayList() {
        array = (T[]) new Object[10];
    }


    /**
     * 0.1 КОНСТРУКТОР, КОТОРЫЙ ПРИНИМАЕТ ОБЫЧНЫЙ МАССИВ И СОЗДАЕТ MagicArray(С ТАКИМИ ЖЕ ЗНАЧЕНИЯМИ)
     */
    public MyArrayList(T[] ints) {
        if (ints != null) {
            this.array = (T[]) new Object[ints.length * 2];
            addAll(ints);
        } else {
            this.array = (T[]) new Object[10];
        }
    }


    /**
     * 1. МЕТОД, КОТОРЫЙ ДОБАВЛЯЕТ В МАССИВ ОДИН ЭЛЕМЕНТ
     * @param value
     */
    /*
    1. Курсор указывает на последнюю свободную ячейку
    2. Проверка. Есть ли свободное места во внутреннем массиве
    3. Если места нет - нужно добавить место
    4. Расширить массив перед добавлением нового элемента
     */
    @Override
    public void add(T value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    /**
     *  2. МЕТОД, КОТОРЫЙ ДИНАМИЧЕСКИ РАСШИРЯЕТ МАССИВ
     */
    /*
    1. Создать массив большего размера (в 2 раза больше)
    2. Переписать в новый массив все значения из старого (до курсора)
    3. Перебрасываем ссылку. Переменная array хранила ссылку на/ "новый" массив
     */
    private void expandArray() {
        System.out.println("Расширяем массив! cursor: " + cursor);
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Расширение массива завершено");
    }


    /**
     * 3. МЕТОД, КОТОРЫЙ ДОБАВЛЯЕТ В МАССИВ НЕСКОЛЬКО ЭЛЕМЕНТОВ
     * @param values T[]
     */
    /*
    с values я могу обращаться точно также, как со ссылкой на массив int
     */
    @SuppressWarnings("unchecked")
    @Override
    public void addAll(T... values) {

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }


    /**
     * 4. МЕТОД, КОТОРЫЙ УДАЛЯЕТ ЭЛЕМЕНТ ПО ИНДЕКСУ
     * (если индекс есть -> удалит элемент -> вернет удаленное значение)
     * @param index int
     * @return
     */
    /*
    1. Проверить валидность индекса (что он не отрицательный и меньше курсора)
       Индекс не валидный. Ничего в массиве не трогаем
    2. Запомнить, какое значение находилось под этим индексом
    3. Удалить значение из ячейки
    4. Передвинуть все элементы за индексом на 1 ячейку влево
    5. Передвинуть курсор влево
    6. Вернуть старое значение
     */
    @Override
    public T remove(int index) {
        if (index < 0 || index >= cursor) {
            return null;
        }
        T value = array[index];
        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;
        return value;
    }


    /**
     * 5. МЕТОД, КОТОРЫЙ ПОКАЗЫВАЕТ ЯВЛЯЕТСЯ ЛИ МАССИВ ПУСТОЙ
     * @return
     */
    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }


    /**
     * 6. МЕТОД, КОТОРЫЙ ПОКАЗЫВАЕТ ТЕКУЩЕЕ КОЛЛИЧЕСТВО ЭЛЕМЕНТОВ В МАССИВЕ
     * @return
     */
    @Override
    public int size() {
        return cursor;
    }


    /**
     * 7. МЕТОД, КОТОРЫЙ ВОЗВРАЩАЕТ СТРОКОВОЕ ПРЕДСТАВЛЕНИЕ МАССИВА
     * @return
     */
    /*
    1. Открыть скобочку.
    2. Перебрать элементы.
    3. Добавить каждый элемент, добавить запятую (если элемент не последний)
    4. Закрыть скобочку
     */
    @Override
    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }


    /**
     * 8. МЕТОД, КОТОРЫЙ ИЩЕТ ЭЛЕМЕНТ ПО ЗНАЧЕНИЮ indexOf (находит индекс первого вхождения)
     * @param value T
     * @return
     */
    /*
    вернуть индекс, если такое значение есть в массиве
     */
    @Override
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }


    /**
     *  9. МЕТОД, КОТОРЫЙ ИЩЕТ ЭЛЕМЕНТ ПО ЗНАЧЕНИЮ lastIndexOf (находит индекс последнего вхождения)
     * @param value T
     * @return
     */
    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }


    /**
     * 10. МЕТОД - СОДЕРЖИТ ЛИ МАССИВ ЭЛЕМЕНТ С ТАКИМ ЗНАЧЕНИЕМ
     * @param value T
     * @return
     */
    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
        /*
        Полный метод прописывается так:

        int index = indexOf(value);
        if (index >= 0) {
            return true;
        } else {

            return false;
        }
        */
    }


    /**
     * 11. МЕТОД, КОТОРЫЙ ВОЗВРАЩАЕТ ЗНАЧЕНИЕ ПО ИНДЕКСУ
     * @param index int
     * @return
     */
    @Override
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }


    /**
     * 12. МЕТОД, КОТОРЫЙ ВОЗВРАЩАЕТ ВСЕ ЗНАЧЕНИЯ В ВИДЕ ОБЫЧНОГО МАССИВА
     * @return
     */
    @Override
    public T[] toArray() {
        if (cursor == 0) {
            return null;
        }
        /*
        Взять какой-то объект из моего массива и узнать(на стадии выполнения программы)тип этого объекта.
        И потом (используя рефлексию), я могу создать массив этого типа данных.
        Создать массив такого же типа, как 0-й элемент.
         */
        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz: " + clazz);
        T[] newArr = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < cursor; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }


    /**
     * 13. МЕТОД - УДАЛЕНИЕ ЭЛЕМЕНТА ПО ЗНАЧЕНИЮ (Если значение есть -> удалит элемент -> вернет true)
     * @param value T
     * @return
     */
    @SuppressWarnings("unchecked") //подавление предупреждения
    @Override
    public boolean removeValue(T value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }


    /**
     * 14. МЕТОД - ЗАМЕНА ЗНАЧЕНИЯ ПО ИНДЕКСУ (есть индекс и новое значение) - возвращает старое значение
     * @param index int
     * @param newValue T
     * @return
     */
    /*
    1. Валидация индекса 0....cursor
    2. Вытащить старое значение - запомнить
    3. Записать новое значение
    4. Вернуть старое значение
     */
    @Override
    public T set(int index, T newValue) {

        if (index < 0 || index >= cursor) {
            return null;
        }
        T oldValue = array[index];
        array[index] = newValue;
        return oldValue;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    /**
     * 15. МЕТОД ВОЗВРАЩАЮЩИЙ СТРОКОВОЕ ПРЕДСТАВЛЕНИЕ МАССИВА
     * @param array
     * @return
     * @param <T>
     */
    public static <T> String toStringBuilder (T[] array){
        if (array == null || array.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++){

            sb.append(array[i]);
            sb.append(i < array.length -1 ? ", " : "]");
        }
        return sb.toString();
    }


    /**
     * 16. МЕТОД МЕНЯЮЩИЙ МЕСТАМИ ДВА ЭЛЕМЕНТА В МАССИВЕ (ЛЮБОГО ТИПА) ПО ИНДЕКСАМ
     * @param array
     * @param index1
     * @param index2
     * @param <T>
     */
    public static <T> void swap (T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    /**
     * 17. МЕТОД, КОТОРЫЙ СЧИТАЕТ СУММУ ЭЛЕМЕНТОВ В МАССИВЕ
     * @param array
     * @return
     * @param <T>
     */
    /*
    Ограничение сверху - Upper Bound. Тип Т должен быть либо классом Х, либо его потомком.
     */
    public static <T extends Number> double sum (T[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            T element = array[i];
            sum += element.doubleValue();
        }
        return sum;
    }


    /**
     * 18. МЕТОД, КОТОРЫЙ ПРИНИМАЕТ ОБЪЕКТ MyList ТОЛЬКО С ЭЛЕМЕНТАМИ ТИПА Number ИЛИ ЕГО НАСЛЕДНИКАМИ
     * @param list
     * @return
     */
    /*
    MyList<? extends Number> - мы работаем с неизвестным типом,
    который является наследником Number.
     */
    public static double listSum (MyList<? extends Number> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i).doubleValue();
        }
        return sum;
    }


    /**
     * 19. МЕТОД ПРИНИМАЕТ MyList С ЭЛЕМЕНТАМИ ТИПА Integer ИЛИ ЕГО ПРЕДКАМИ
     * @param list
     */
    /*
    Ограничения снизу - Lower Bounds
    <? super X> - Мы работаем с неизвестным типом, который является классом Х или его родителем(супер-классом)
    Integer, Number, Object
     */
    public static void addNumbers (MyList<? super Integer> list){
        for (int i =0; i < 5; i++){
            list.add(i);
        }
    }


    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    /**
     *                    ITERATOR И ВЛОЖЕНЫЙ КЛАСС
     * @return
     */
    /*
    Интерфейс Iterable означает, что объекты этого класса можно перебирать (итерировать)
    Этод метод Iterator<T> iterator() - возвращает итератор для коллекции

    Интерфейс Iterator - собственно итератор, который позволяет обходить коллекцию
    boolean hasNext() - еть ли следующий элемент
    T next() - возвращает следующий элемент
    void removе() - обязательный - удаляет последний возвращенный элемент
     */
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < cursor;
        }

        @Override
        public T next() {
            return array[currentIndex++];

            /* Так выглядит полная запись этого метода:
            T value = array[currentIndex];
            currentIndex++;
            return value;
            */
        }
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    /**
     * 20. МЕТОД КОТОРЫЙ ПРОВЕРЯЕТ ВАЛИДАЦИЮ EMAIL
     * @param email
     * @return
     */
    public static boolean isEmailValid(String email) {
        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        if (email.indexOf('.', indexAt + 2) == -1) return false;

        // 3. После последней точки должно быть минимум 2 символа
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) { // Символ НЕ подходит
                return false;
            }
        }

        // 5. До собаки должен быть хотя бы 1 символ
        if (indexAt == 0) return false;

        if (!Character.isAlphabetic(email.charAt(0))) return false;

        return true;
    }

    /**
     * 21. МЕТОД КОТОРЫЙ ПРОВЕРЯЕТ ВАЛИДАЦИЮ ПАРОЛЯ
     * @param password
     * @return
     */
    /*
    Требования к паролю
    1. Длина >= 8
    2. Должна быть мин 1 маленькая буква
    3. Должна быть мин 1 большая буква
    4. Должна быть мин 1 цифра
    4. Должен быть мин 1 спец.символ "!%$@&*()[]"
     */

    /*
    4 переменный типа boolean
        boolean isDigit = true;
        boolean isLowerCase = false;
        Запускаю цикл
        И после цикла во всех 4-х должено быть true. - тогда вернуть true
        Иначе пароль проверку не прошел - вернуть false
     */

    public static boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            return false;
        }

        boolean isDigit = false;

        String symbols = "!%$@&*()[]";

        // альтернативный способ объявления переменных
        boolean[] result = new boolean[4]; // false, false

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) result[0] = true;
            if (Character.isUpperCase(ch)) result[1] = true;
            if (Character.isLowerCase(ch)) result[2] = true;
            if (symbols.indexOf(ch) >= 0) result[3] = true;
        }

        // Если хотя бы в одной переменной останется значение false,
        // то весь пароль не будет признана валидным = из метода вернется false
        return  result[0] && result[1] && result[2] && result[3];
    }
}
