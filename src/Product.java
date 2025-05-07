// Задача 5: Сортировка товаров по цене и рейтингу TreeSet
// Создайте класс Product с полями name, price (double) и rating (int). Отсортируйте товары:
//        1.	Сначала по цене (от дешевых к дорогим).
//        2.	Если цена одинаковая – по рейтингу (от высокого к низкому).

public class Product {

    private String name;
    private double price;
    private int rating;

    public Product(int rating, double price, String name) {
        this.rating = rating;
        this.price = price;
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

