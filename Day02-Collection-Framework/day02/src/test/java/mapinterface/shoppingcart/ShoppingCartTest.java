package mapinterface.shoppingcart;


import static org.junit.jupiter.api.Assertions.*;

import mapinterface.implementashoppingcart.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class ShoppingCartTest {

    @BeforeEach
    void setUp() {
        ShoppingCart.addProduct("Laptop", 800);
        ShoppingCart.addProduct("Phone", 500);
        ShoppingCart.addProduct("Headphones", 100);

        ShoppingCart.addToCart("Laptop", 1);
        ShoppingCart.addToCart("Phone", 2);
        ShoppingCart.addToCart("Headphones", 3);
    }

    @Test
    void testCartItemsOrder() {
        Map<String, Integer> cart = ShoppingCart.getCartItems();

        assertEquals(3, cart.size());
        assertEquals(1, cart.get("Laptop"));
        assertEquals(2, cart.get("Phone"));
        assertEquals(3, cart.get("Headphones"));

        assertTrue(cart.keySet().toArray()[0].equals("Laptop"));
        assertTrue(cart.keySet().toArray()[1].equals("Phone"));
        assertTrue(cart.keySet().toArray()[2].equals("Headphones"));
    }

    @Test
    void testSortedByPrice() {
        Map<Double, String> sortedItems = ShoppingCart.getSortedItemsByPrice();

        assertEquals(3, sortedItems.size());
        assertEquals("Headphones", sortedItems.get(100.0));
        assertEquals("Phone", sortedItems.get(500.0));
        assertEquals("Laptop", sortedItems.get(800.0));
    }

    @Test
    void testTotalPrice() {
        assertEquals(800 + (500 * 2) + (100 * 3), ShoppingCart.getTotalPrice());
    }

    @Test
    void testRemoveItem() {
        ShoppingCart.removeItem("Phone");
        Map<String, Integer> cart = ShoppingCart.getCartItems();
        assertFalse(cart.containsKey("Phone"));
        assertEquals(2, cart.size());
    }
}
