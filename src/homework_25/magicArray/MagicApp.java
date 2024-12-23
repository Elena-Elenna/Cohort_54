package homework_25.magicArray;

public class MagicApp {
    public static void main(String[] args) {

        MagicArrayHW25<Integer> number = new MagicArrayHW25<>();
        number.addAll(0,1,2,3,4,5,6);
        System.out.println(number);

        System.out.println(number.lastIndexOf(8));
        System.out.println(number.indexOf(5));
        System.out.println(number.remove(0));
        System.out.println(number);
        System.out.println(number.get(0));
        System.out.println(number);
        System.out.println(number.removeByValue(5));
        System.out.println(number);
        System.out.println(number.set(2, 5));
        System.out.println(number);
        System.out.println(number.size());
        System.out.println("++++++++++++++++++++++");

        MagicArrayHW25<String> str = new MagicArrayHW25<>();

        str.add("Java");
        System.out.println(str);
        str.addAll("Hallo","world");
        System.out.println(str);
        System.out.println(str.lastIndexOf("Java"));
        System.out.println(str);
        System.out.println(str.indexOf("world"));
        System.out.println(str.remove(1));
        System.out.println(str.removeByValue("world"));
        System.out.println(str.removeByValue("JV"));

    }

}
