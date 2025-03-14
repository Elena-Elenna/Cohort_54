package consultation_15bookStore.main.model;

public class Goods {
    public static int counter = 1;
    private int id;
    private String name;
    private double price;
    CategoryGoods category;

    public Goods(String name, double price, CategoryGoods category) {
        this.id = counter++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public CategoryGoods getCategory() {
        return category;
    }

    public void setCategory(final CategoryGoods category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", price = " + price +
                ", category = " + category +
                '}';
    }
}
