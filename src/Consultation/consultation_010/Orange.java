package Consultation.consultation_010;

public class Orange extends Fruit {
    public Orange(String title) {
        super(title);
    }

    public void  extractJuice() {
        if (isReady) {
            System.out.println("Получаем вкусный сок");
        } else {
            System.out.println("Фрукт не готов. Сока нет");
        }
    }

//    @Override
//    public void ripen() {
//        System.out.println("Ripen from Orange");
//        isReady = true;
//    }

    @Override
    public String toString() {
        System.out.println("toString Orange");
        return "{ Orange title: " + title + "}";
    }
}
