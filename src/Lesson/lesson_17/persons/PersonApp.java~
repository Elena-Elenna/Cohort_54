package lesson_17.persons;

public class PersonApp {
    public static void main(String[] args) {
        Person garry = new Person("Garry",31,"Photo");
        System.out.println(garry.toString());

        Person john = new Person("John",75,"Musik");
        System.out.println(john.toString());

        Person[] people = new Person[5];  //Создается массива для пяти ссылок на обьекты типа person
        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom",5, "crying");

        System.out.println("================================");
        System.out.println(people[0].toString());
        System.out.println("people[0].getModel: " + people[0].getName());

        people[0].setName("Peter");
        System.out.println("people[0]:" + people[0].toString());
        System.out.println("garry:" + garry.toString());

        System.out.println("=========================");
        for (int i =0; i < people.length; i++){
            if (people[i] != null) {
                System.out.println(people[i].toString());
                System.out.println("people[1].getModel" + people[1].getName());
            } else {
                System.out.println("people[" + i + "] is null");
            }
        }
        System.out.println("================================");

        Person test = new Person("Test",50,"coding");
        people[2] = test;
        people[2].setName("TestNew");
        test.setAge(60);
        System.out.println(people[2].toString());

        test = null;
        System.out.println(people[2].getName());

        test = people[1];
        System.out.println(test.toString());
    }
}
