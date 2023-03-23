package com.ds.string;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "This is India";
       /* String str = "India";
        String str = "1,2,3,4";*/
        WordPattern stringType;
      boolean b=  Character.isLetter(str.charAt(0));
         if(str.contains(" ")) {
             stringType = WordPattern.STR;
        }else if(b){
             stringType = WordPattern.CHAR;
        }else {
             stringType = WordPattern.NUM;
         }
        switch (stringType) {
            case STR:
                wordByWordReverse(str);
                break;
            case CHAR:
                charByCharReverse(str);
                break;
            case NUM:
                System.out.println("You choose AUDI !");
                break;
        }
    }
        private static void wordByWordReverse (String str){
            LinkedList<String> ll = Arrays.stream(str.split(" ")).collect(Collectors.toCollection(LinkedList::new));
            LinkedList<String> resultList = new LinkedList();
            for (String s :
                    ll) {
                resultList.addFirst(s);
            }
            System.out.println(resultList);
        }

        private static void charByCharReverse (String str){
            LinkedList<String> ll = Arrays.stream(str.split("")).collect(Collectors.toCollection(LinkedList::new));
            LinkedList resultList = new LinkedList();
            for (String al :
                    ll) {
                resultList.addFirst(al);
            }
            System.out.println(resultList);
        }
        enum WordPattern {
            NUM, STR, CHAR;
        }

}