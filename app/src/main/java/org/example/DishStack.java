package org.example;

public class DishStack {
    private static final int MAX_SIZE = 10;
    private Dish[] stack;
    private int top;

    public DishStack() {
        stack = new Dish[MAX_SIZE];
        top = -1;
    }

    public void push(Dish dish) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack is full! Cannot push: " + dish.getDescription());
            return;
        }
        stack[++top] = dish;
    }

    public Dish pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[top--];
    }

    public Dish peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    // Optional: clear the stack
    public void clear() {
        top = -1;
    }
}
