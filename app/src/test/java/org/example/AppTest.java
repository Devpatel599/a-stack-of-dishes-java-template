package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testStackPushAndPop() {
        DishStack stack = new DishStack();
        Dish dish1 = new Dish("Test Dish 1");
        Dish dish2 = new Dish("Test Dish 2");

        stack.push(dish1);
        stack.push(dish2);

        assertEquals(2, stack.size());
        assertEquals("Test Dish 2", stack.peek().getDescription());
        assertEquals("Test Dish 2", stack.pop().getDescription());
        assertEquals("Test Dish 1", stack.pop().getDescription());
        assertEquals(0, stack.size());
    }

    @Test
    public void testStackPeekOnEmpty() {
        DishStack stack = new DishStack();
        assertNull(stack.peek());
    }

    @Test
    public void testStackPopOnEmpty() {
        DishStack stack = new DishStack();
        assertNull(stack.pop());
    }

    @Test
    public void testStackFull() {
        DishStack stack = new DishStack();
        for (int i = 0; i < 10; i++) {
            stack.push(new Dish("Dish " + i));
        }
        // Trying to push when full
        stack.push(new Dish("Overflow Dish"));
        assertEquals(10, stack.size());
    }
}
