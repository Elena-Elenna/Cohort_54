package Lesson.lesson_21;

public class Passenger {
    private static int counter;
    private final int id;

    private String name;

    public Passenger(String name) {
        this.name = name;
        this.id = counter++;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder("Passenger: {");
        st.append("id: ").append(id);
        st.append("; name: ").append(name);
        st.append("}");
        return st.toString();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
