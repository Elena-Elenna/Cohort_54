package homework_27;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами,
возвращающими среднюю температуру для каждого времени года.
 */

public enum Season {
    WINTER("December, January, February", -10),
    SPRING("March, April, May", 10),
    SUMMER("June, July, August", 28),
    AUTUMN("September, October, November", 12);

    private String month;
    private double temperature;


    Season( String month, double temperature) {
        this.month = month;
        this.temperature = temperature;
    }


    public String getMonth() {
        return this.month;
    }

    public double getTemperature() {
        return this.temperature;
    }


    public static void main(String[] args) {

        for (Season season : Season.values()) {
            System.out.println(season);
            System.out.println(season.getMonth());
            System.out.println(season.getTemperature());
            System.out.println("-----------------\n");

        }

    }

}
