package com.java.gfg;

import java.util.Stack;

public class StackImplementation {
    //Function to check if brackets are balanced or not.
        static boolean ispar(String x)
        {
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<x.length();i++) {
                char ch = x.charAt(i);
                if(ch=='(' || ch=='[' || ch=='{') {
                    stack.push(ch);
                    continue;
                }
                if(stack.isEmpty()) return false;

                char poppedChar = stack.pop();
                //if(poppedChar=='(' && ch==')') return

                if(ch == ')' && poppedChar != '(') {return false;}
                if(ch == ']' && poppedChar != '[') {return false;}
                if(ch == '}' && poppedChar != '{') {return false;}

            }
            return stack.isEmpty();
        }

    public static void main(String[] args) {
        System.out.println(ispar("="));
    }
}
