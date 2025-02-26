package lesson_26;

public class Generics<K, V>{
    private K key;
    private V value;


    public Generics(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenExample {" +
                "key = " + key +
                "; value = " + value +
                '}';
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Generics<Integer, String> genExample = new Generics<>(100, "String");
        System.out.println(genExample);

        Generics<String, String> genExample1 = new Generics<>("a", "b");
        System.out.println(genExample1);
    }
}
