package mapinterface.implementashoppingcart;


import java.util.*;

public class ShoppingCart {
    private static Map<String, Double> productPrices = new HashMap<>();
    private static Map<String, Integer> cartItems = new LinkedHashMap<>();
    private static TreeMap<Double, String> sortedItemsByPrice = new TreeMap<>();

    public static void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public static void addToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }

        cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
        sortedItemsByPrice.put(productPrices.get(product), product);
    }

    public static Map<String, Integer> getCartItems() {
        return cartItems;
    }

    public static Map<Double, String> getSortedItemsByPrice() {
        return sortedItemsByPrice;
    }

    public static double getTotalPrice() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    public static void removeItem(String product) {
        if (cartItems.containsKey(product)) {
            cartItems.remove(product);
            sortedItemsByPrice.remove(productPrices.get(product));
        }
    }

    public static void main(String[] args) {
        addProduct("Laptop", 45000);
        addProduct("Phone", 12000);
        addProduct("Headphones", 300);

        addToCart("Laptop", 1);
        addToCart("Phone", 2);
        addToCart("Headphones", 3);

        System.out.println("Cart Items (Order Added): " + getCartItems());
        System.out.println("Sorted Items by Price: " + getSortedItemsByPrice());
        System.out.println("Total Price: " + getTotalPrice());

        removeItem("Phone");
        System.out.println("Cart after removing Phone: " + getCartItems());
    }
}

