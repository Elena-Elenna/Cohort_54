package lesson_25.generics;

public class WrappersClass {
    public static void main(String[] args) {

        //Классы - обертки используются в Java для представления примитивных типов данных
        // как объектов(ссылочных типов данных).
        /*
        Byte - обертка для byte
        Short - обертка для short
        Integer - обертка для int
        Long - обертка для long
        Double - обертка для double
        Float - обертка для float
        Character - обертка для char
        Boolean - обертка для boolean
         */
        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // Автоупаковка примитива int в ссылочный Integer
        System.out.println(wrapperInt);

        int primInt = wrapperInt; //Автораспаковка из типа Integer в примитив int
        System.out.println(primInt);

        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(Integer.MIN_VALUE);

        //Особенности сравнения классов - оберток
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);//true
        System.out.println(a.equals(b));//true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false
        System.out.println(c.equals(d));//true

        Integer c1 = -128;
        Integer d1 = -128;
        System.out.println(c1 == d1); //true
        System.out.println(c1.equals(d1));//true

        //Все числа в этом диапазоне от -128 до 127 - используется кеширование объектов.
        //Для гарантированного правильного сравнения оберточных типов нужно использовать equals().
        System.out.println("+++++++++++++++");

        //Общие(или схожие) методы которыми обладают классы-обертки
        //1, valueOf() - Упаковка.Преобразует строку или примитив в соответствующий объект класса-обертки

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");

        System.out.println(e == e1);

        Double dab = Double.valueOf("154.5");
        System.out.println(dab + 1);

        //2. parseXXX() - преобразует строку в соответствующий примитив

        int parse = Integer.parseInt("456") +100;
        double dabl = Double.parseDouble("456.5") +100;
        System.out.println(parse);
        System.out.println(dabl);


//        System.out.println(Integer.parseInt("abcd")); //если не получится извлечь значение - будет выброшена ошибка

        //3, toString() - возвращает строковое представление значения
        String str = dab.toString();
        System.out.println(str + 10);

        //4. equals() - сравнивает два объекта по значению

        //5. xxxValue() - Распаковка. Возвращает значение объекта как примитивный тип

        Double d2 = Double.valueOf(125.5); //Явная принудительная УПАКОВКА
        double d3 = d2.doubleValue(); //Явная принудительная РАСПАКОВКА

        // Все числовые обертки наследуются от абстрактного класса Number
        // Byte, Short, Integer, Long, Double, Float

        /*
        byteValue();
        shortValue();
        intValue();
        longValue();
        floatValue();
        doubleValue();
         */

        Integer integer = 123456;

        System.out.println(integer.doubleValue());

        short sh = integer.shortValue();
        System.out.println(sh);

        double sum = add(14253,324.56);
        System.out.println(sum);

        Integer a1 = Integer.MAX_VALUE;
        a1 += 100;
        System.out.println(a1);


    }
    public static double add(Number number1,Number number2){
        double d1 = number1.doubleValue();
        double d2 = number2.doubleValue();
        return d2 + d1;
    }
}
