package lesson_20;

//Smartphone is-a Vehicle - НЕ верно. Наследоваться нельзя.
//Bus is-a Vehicle -> Верно. Можно применять наследование.

public class Bus extends Vehicle{
        /*
   A extends B -> А наследуется от класса В (класс А расширяет класс В)
   A - потомком (ребенком, наследником), В - родитель (родительский класс)
     */

    private int capacity; // вместимость
    private int countPassengers; // сколько сейчас пассажиров в автобусе

    public Bus(String model, int capacity, int year){
        // Нужно сначала создать объект родителя
        // Вызов конструктора родительского класса
        super(model,year); //ключевое super слово обращение к родителю
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    // Взять на борт одного пассажира
    public boolean takePassengers(){
        if(countPassengers < capacity){ // проверка - есть ли свободное место
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + model);
            return  true;
        }
        // по сути пишу блок else
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров\n",
                this.getModel(), countPassengers);
        return false;
    }

    //высадка пассажира из автобуса
    public boolean dropPassengers(){
        if (countPassengers > 0){ //проверка - есть ли в автобусе пассажиры
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса" + model);
            return true;
        }
        System.out.printf("В автобусе %s больше нет пассажиров\n", model);
        return false;
    }
}
