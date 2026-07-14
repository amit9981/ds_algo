package com.job2026;

import java.util.Stack;

public class ValidPatternForStack {
        public static boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++) {
                char ch = s.charAt(i);
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
        System.out.println(isValid("([]{})"));

    }

}
