package Consultation.consultation_16.main.model;

public class Goods {
    public static int counter = 1;
    int id;
    String name;
    CategoryGoods category;
    double price;

    public Goods(String name, CategoryGoods category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryGoods getCategory() {
        return category;
    }

    public void setCategory(CategoryGoods category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
