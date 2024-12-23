package lesson_17;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name){
        if (name == null || name.isEmpty()){
            System.out.println("Не корректное значение имени!");
            return; //прекращает работу метода
        } //можно написать через if - else или через return
        this.name = name;
    }

    public void setAge(int age){
        if (age >= 0 && age < 20){
            this.age = age;
        }
    }

    public void eat(){
        System.out.println("Cat eat");
        weight++;
    }

    public int getAge(){
        return age;
    }
    //по какой то причине я не хочу давать значение веса кота
//    public int getWeight(){
//        return weight;
//    }
    public String getName(){
        return name;
    }

    public void sayMeow(){
        System.out.println("Cat say meow");
        test();
    }

    private void test(){
        System.out.println("Test");
    }

    public String toString(){
        return "Cat " + name + ",  age:" + age + ",  weight: " + weight;
    }
}
