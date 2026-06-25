package Week1.Excercise2_EcommercePlatformSearchFunction;

public class LinearSearch {

    public static Product search(Product[] products, int id) {

        for (Product product : products) {

            if (product.productId == id) {
                return product;
            }

        }

        return null;
    }

}