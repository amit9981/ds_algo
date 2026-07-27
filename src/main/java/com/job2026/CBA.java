package com.job2026;

import java.util.Stack;

public class CBA {
    /*static final String add = "+";
    static final String mult = "*";
    static final String div = "/";

    public static void main(String[] args) {

        int sumNumber = 0;

        String str = "100 200 + 2 / 5 * 7 +";


        //757
        // 100 200=300; 150*5=750;
        String splitArr[] = str.split(" ");
        Stack stack = new Stack();
        for (int i = 0; i < splitArr.length; i++) {
            if (Integer.TYPE.isInstance(splitArr[i])) {
                stack.push(splitArr[i]);
            } else {
                switch (splitArr[i]) {
                    case add:
                        while(!stack.isEmpty()) {
                            sumNumber += (Integer) stack.pop();
                        }
                        break;
                    case mult:
                        while(!stack.isEmpty()) {
                            sumNumber *= (Integer) stack.pop();
                        }
                        break;
                    case div:
                        while(!stack.isEmpty()) {
                            sumNumber = sumNumber / (Integer) stack.pop();
                        }
                        break;


                }
            }
        }
        System.out.println("result ::"+ sumNumber);


    }*/

     public static void main(String[] args) {

        String str = "100 200 + 2 / 5 * 7 +";

        System.out.println("Result = " + evaluatePostfix(str));
    }

    public static int evaluatePostfix(String expression) {

        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            switch (token) {

                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    int divisor = stack.pop();
                    int dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }




}
