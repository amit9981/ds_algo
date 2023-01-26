package com.ds.stack;

import java.util.ArrayList;

public class CustomStack<T> {
        private ArrayList<T> data;

        public CustomStack() {
            data = new ArrayList<T>();
        }

        public void push(T element) {
            data.add(element);
        }

        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return data.remove(data.size() - 1);
        }

        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return data.get(data.size() - 1);
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // prints 3
        System.out.println(stack.pop()); // prints 2
        System.out.println(stack.peek()); // prints 1
    }
}
