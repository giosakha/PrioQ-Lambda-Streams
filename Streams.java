package finkhalas;
//most of them are in the notes
import java.util.Arrays;
import java.util.List;

public class Testt1 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        // Chain stream operations: filter, map, sort, and forEach
        myList.stream()
            .filter(s -> s.startsWith("c"))      // Filter elements starting with "c"
            .map(String::toUpperCase)            // Convert elements to uppercase
            .sorted()                            // Sort the elements
            .forEach(System.out::println);      // Print each element
    }
}
//reduce()
import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenovo Laptop", 28000f));
        productsList.add(new Product(4, "Toshiba Laptop", 29000f));

        // This is a more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (sum, price) -> sum + price); // accumulating price

        System.out.println("Total Price: " + totalPrice);
    }
}
//count()
import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenovo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        // Count number of products based on the filter
        long count = productsList.stream()
                .filter(product -> product.price < 30000) // Filter products with price less than 30000
                .count(); // Count the number of filtered products

        System.out.println("Number of products with price less than 30000: " + count);
    }
}

