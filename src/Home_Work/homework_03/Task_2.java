package Home_Work.homework_03;

public class Task_2 {
    public static void main(String[] args) {

    /*
    Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
    Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4.
    Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
    Выведите на экран значение переменной.
    Какой остаток от деления программа "потеряла"?
    */
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int summa = (a + b + c + d) / 4;
        System.out.println("Summa: " + summa);

        int ostat = (a + b + c + d) % 4;
        System.out.println("Ostatok: " + ostat);


        // ++++++++++++++++++++++++++++++++++++++++++++++

        //Скопировать строку Ctrl + D | Cmd + D
        // Удалить строку Ctrl + Y | Cmd + <-

        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;

        // Приоритет математических операций.
        // Сначала деление / умножение / взятие остатка. Затем + / -
        // Скобки имеют наивысший приоритет

        // 6 / 4 -> 1 целая и 2 остатке

        int average = (var1 + var2 + var3 + var4) / 4;
        int rest = (var1 + var2 + var3 + var4) % 4;

        System.out.println("average: " + average);
        System.out.println("Остаток деления на 4 равен: " + rest);

        // Option 2
        int sum = var1 + var2 + var3 + var4;
        int average1 = sum / 4;
        int rest1 = sum % 4;
        System.out.println("sum: " + sum);
        System.out.println("average1: " + average1);
        System.out.println("rest1: " + rest1);

    }
}

