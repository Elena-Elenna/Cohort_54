package Lesson.lesson_21;
    /*
АССОЦИАЦИЯ - это связь, при которой один объект связан с другим объектом. Это наиболее общая форма связи.

АГРЕГАЦИЯ - это более специфическая форма ассоциации, представляющая собой отношение "часть-целое",
где часть может существовать независимо от целого.

КОМПОЗИЦИЯ - это более жесткая форма агрегации, где часть не может существовать без целого.
Если целое уничтожается, часть также уничтожается.

Для создания связи типа HAS_A мы определяем поле класса,которое будет хранить ссылку на объект другого класса.

АССОЦИАЦИЯ (в том числе АГРЕГАЦИЯ и КОМПОЗИЦИЯ) реализуется через создание ссылок на другие объекты внутри класса.
Отношение, где один класс использует другой класс в качестве одного из своих полей.
Класс содержит поле, которое ссылается на объекты другого класса.

ВАЖНЫЕ аспекты АССОЦИАЦИИ
1.Направленность связи: Однонаправленная и двунаправленная.
2.Кардинальность связи: Определяет, сколько объектов одного класса может быть ассоциировано с объектом другого класса
3.One-to-One (один к одному), One-to-Many (один ко многим), Many-to-Many (многие ко многим).

1 : 1 - Автобус и Двигатель.
Каждый автобус будет иметь ровно один двигатель. И на каждый двигатель приходится ровно один автобус

1 : Many - Автобус и Список пассажиров.
Один автобус может перевозить множество пассажиров, каждый пассажир находится в одном автобусе.

Many : Many - Список Автобусов и список автобусных остановок.
Каждый автобус останавливается на множестве остановок и каждая остановка может обслужить множество автобусов
    */


public class Autobus {
    private static int counter;

    private final int id;
    private final int capacity;
    private int countPassengers;
    private final Passenger[] passengers; //список пассажиров,агрегация,однонаправленная связь

    // поле, хранящее ссылку на объект BusDriver и Autopilot
    private BusDriver driver; //агрегация (мягкая связь)
    private Autopilot autopilot; //композиция (жесткая не разрывная связь)


    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.driver = busDriver;
        this.capacity = capacity;
        //Часть (объект автопилота) создается при создании целого объекта автобуса
        this.autopilot = new Autopilot("AD - v001");
        //реализуем двунаправленность связи
        this.autopilot.setAutobus(this); //передаю ссылку на этот автобус
        this.passengers = new Passenger[capacity]; // null
    }

    public boolean takePassenger(Passenger passenger) {
         /*
        Надо проверить:
        1. Есть ли свободное место
        2. Находится ли этот пассажир уже в автобусе
        3. Если проверки пройдены - садим на борт
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем кол-во пассажиров в автобусе
            3.3. Возвращаем true
        4. Если что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */
        if (countPassengers < capacity) {
            // Место есть
            // Надо проверить, есть ли такой пассажир в автобусе
            // Декомпозиция
            if (isPessengerInBus(passenger)) {
                //такой пассажир уже есть в списке
                System.out.printf("Пассажир id %d уже в автобусе c id %d\n", passenger.getId(), this.id);
                return false;
            }
            //садим на борт
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир id %d завершил посадку в автобус c id %d\n", passenger.getId(), this.id);
            return true;
        }
        //свободных мест нет

        System.out.printf("В автобусе c id %d свободных мест нет! \n", this.id);
        return false;
    }

     /*
    Проверить есть ли пассажир в автобусе.
    Убрать его из списка пассажиров
    [ 1, 2, 6, 78, 99] -> убрать с id 6 [1, 2, 78, 99]
    Уменьшить кол-во пассажиров
     */

    public boolean dropPassenger(Passenger passenger) {
        if (passenger == null) return false;
        int index = findPassenger(passenger);
        if (index == -1) {
            // Пассажира нет в автобусе
            System.out.printf("Пассажир с id: %d в автобусе не найден!\n", passenger.getId());
            return false;
        }
        // Пассажир найден. Его нужно высадить = удалить из списка пассажиров
        for (int i = index + 1; i < countPassengers; i++) {
            passengers[i - 1] = passengers[i];
        }
        passengers[countPassengers -1] = null; // не обязательная строка
        countPassengers--; // Уменьшаем кол-во пассажиров (заодно сдвигаем наш курсор)

        System.out.printf("Пассажир %s с id: %d вышел из автобуса\n", passenger.getName(), passenger.getId());
        return true;
    }


    private int findPassenger(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return i;
            }
        }
        return -1; // пассажир не найден. Возвращаем -1
    }

    // Метод возвращающий список пассажиров
    public String getPassengersList() {
        /*
        Перебрать всех пассажиров.
        Склеить строку из пассажиров в едином виде (id + name)
         */
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < countPassengers; i++) {
            // Взять каждого пассажира и добавить инфо о нем
            Passenger tempPass = passengers[i];
            sb.append("Passenger: {id: ").append(tempPass.getId());
            sb.append("; name: ").append(tempPass.getName()).append("}; ");
        }

        // Если пассажиров нет, я хочу чтоб вернулось "{}"
//        System.out.println(sb.toString());
        // Хочу убрать лишнюю "; " после последнего пассажира в списке
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

//    public boolean dropPassenger(Passenger passenger) {
//        for (int i = 0; i < countPassengers; i++) {
//            if (passengers[i].getId() == passenger.getId()) {
//                for (int j = i; j < countPassengers - 1; j++) {
//                    passengers[j] = passengers[j + 1];
//                }
//                countPassengers--;
//                System.out.printf("Пассажир id %d высажен из автобуса c id %d\n", passenger.getId(), this.id);
//                return true;
//            }
//        }
//        System.out.printf("Пассажир id %d не найден в автобусе c id %d\n", passenger.getId(), this.id);
//        return false;
//    }


    private boolean isPessengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        //пассажира с таким id нет в нашем массиве пассажиров
        return false;
    }


    public void installNewAutopilot(String softwareVersion) {
        this.autopilot.setAutobus(null);
        //следить за правильностью ссылок с обеих сторон двунаправленной связи
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }

    //Объект автобуса будет управлять автопилотом
    public void updateAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }


    public String toString() {
        StringBuilder str = new StringBuilder("Autobus: {");
        str.append("id: ").append(id);
        str.append("; capacity: ").append(capacity);
        str.append("; driver: ").append(driver);
        str.append("; autopilot: ").append(autopilot);
        str.append("}");
        return str.toString();
    }


    public BusDriver getDriver() {
        return this.driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return this.id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCountPassengers() {
        return this.countPassengers;
    }
}
