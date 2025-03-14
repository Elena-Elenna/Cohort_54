package consultation_12.subscribes;

public class BookstoreApp {
    public static void main(String[] args) {
//        User user1 = new User("Sergey");
//        System.out.println("User: " + user1.getUserName() + ", id: " + user1.getUserId() + ", count = " + User.count);
//        User user2 = new User("Lena");
//        System.out.println("User: " + user2.getUserName() + ", id: " + user2.getUserId() + ", count = " + User.count);
//        User user3 = new User("Philiph");
//        System.out.println("User: " + user3.getUserName() + ", id: " + user3.getUserId() + ", count = " + User.count);


        MonthlySubscription ms = new MonthlySubscription("Software2", 10.99, 12);
        System.out.println(ms.getProduct_name() + ", " + ms.getMonths());
        Subscription subscription = new MonthlySubscription("Software", 10.99, 12);
        System.out.println(subscription.getProduct_name() + ": " + subscription.getCost() + " for " + ((MonthlySubscription) subscription).getMonths() + " months");

        Product product = new DigitalProduct("Book", 20);
        System.out.println(product.getProductName() + ": " + ((DigitalProduct) product).getDownloads());

        Subscription subscription2 = new AnnualSubscription("Course", 99.99, 1);
        System.out.println(subscription2.getProduct_name() + ": " + subscription2.getCost() + " for " + ((AnnualSubscription) subscription2).getYears() + " years");

        Product product2 = new PhysicalProduct("Phone", 500.0);
        System.out.println(product2.getProductName() + ": " + ((PhysicalProduct) product2).getWeight());
    }

}
