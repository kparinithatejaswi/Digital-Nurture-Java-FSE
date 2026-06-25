package Week1.Excercise2_EcommercePlatformSearchFunction;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Book", "Education")

        };

        System.out.println("Linear Search");

        Product p1 = LinearSearch.search(products, 104);

        if (p1 != null)

            p1.display();

        else

            System.out.println("Product Not Found");

        System.out.println();

        System.out.println("Binary Search");

        Product p2 = BinarySearch.search(products, 104);

        if (p2 != null)

            p2.display();

        else

            System.out.println("Product Not Found");

    }

}