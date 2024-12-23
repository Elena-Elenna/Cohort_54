package homework_03;

public class Task_4 {
    public static void main(String[] args) {


/*
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).
Вычислите среднюю температуру за неделю и выведете ее на печать.
 */
        int m = 12;
        int di = 15;
        int mi = 17;
        int don = 16;
        int fr = 13;
        int sa = 15;
        int so = 17;
        int tem = (m + di + mi + don + fr + sa + so) / 7;
        System.out.println("Temperatura:" + tem);


        // ++++++++++++++++++++++++++++++++++++++
        int t = 20;
        int t1 = 18;
        int t2 = 22;
        int t3 = 17;
        int t4 = 23;
        int t5 = 21;
        int t6 = 20;
        int days = 7;

        // Сумма всех чисел деленная на их количество
        int sumTemp = t + t1 + t2 + t3 + t4 + t5 + t6;
        System.out.println("sumTemp: " + sumTemp);


        // 141 / 7 = 20 и 1 в остатке
        // 141.0 / 7.0 = 20.142 (double)

        double averageTemp = (double) sumTemp / days;
        System.out.println("averageTemp: " + averageTemp);

    }
}
