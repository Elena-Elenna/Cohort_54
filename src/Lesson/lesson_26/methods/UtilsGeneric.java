package Lesson.lesson_26.methods;

import utils.MyList;

public class UtilsGeneric {
    //МЕТОД ВОЗВРАЩАЮЩИЙ СТРОКОВОЕ ПРЕДСТАВЛЕНИЕ МАССИВА

    public static <T> String printArray (T[] array){
        if (array == null || array.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++){
            sb.append(array[i]);
            sb.append(i < array.length -1 ? ", " : "]");
        }
        return sb.toString();
    }


    //МЕТОД МЕНЯЮЩИЙ МЕСТАМИ ДВА ЭЛЕМЕНТА В МАССИВЕ (ЛЮБОГО ТИПА) ПО ИНДЕКСАМ

    public static <T> void swap (T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    //МЕТОД, КОТОРЫЙ СЧИТАЕТ СУММУ ЭЛЕМЕНТОВ В МАССИВЕ

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


    //МЕТОД, КОТОРЫЙ ПРИНИМАЕТ ОБЪЕКТ MyList ТОЛЬКО С ЭЛЕМЕНТАМИ ТИПА Number ИЛИ ЕГО НАСЛЕДНИКАМИ
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


    //МЕТОД ПРИНИМАЕТ MyList С ЭЛЕМЕНТАМИ ТИПА Integer ИЛИ ЕГО ПРЕДКАМИ
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


    /*
           ПРАВИЛО " PECS "
    Producer Extends, Consumer Super
    Производитель - когда коллекция только поставляет данные(мы их читаем) - extends
    Extends - цель безопасно читать из нашего объекта.

    Потребитель - когда коллекция потребляет данные(мы их записываем) - super
    Super - цель безопасно записывать в коллекцию.
     */

}
