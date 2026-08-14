package com.job2026.leet75;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(productExceptSelf()));
        //increasingTriplet();
        stringCount();
        String str = "IceCreAm";
        int left = 0;
        int right = str.length() - 1;
        char[] charArr = str.toCharArray();
        Set set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        while (left < right) {
            while (left < right && !set.contains(str.charAt(left))) {
                left++;
            }
            while (left < right & !set.contains(str.charAt(right))) {
                right--;
            }
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }

        //reverse words
        String st = "the sky is blue";
        String[] strArr = st.split(" ");
        System.out.println(Arrays.stream(strArr).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" ")));
        List<String> words = Arrays.stream(st.split(" ")).collect(Collectors.toList());
        Collections.reverse(words);
        System.out.println(words.stream().collect(Collectors.joining(" ")));
        String stnew = words.stream().collect(Collectors.joining(" "));
        System.out.println(stnew);


    }
    public static int[] productExceptSelf() {
        int[] nums={1,2,3,4};
        int result[]=new int[nums.length];
        result[0]=1;
        for (int i = 1; i < result.length; i++) {
            result[i]=result[i-1]*nums[i-1];
        }
        int rightProduct=1;
        for (int i = nums.length-1;i>=0 ;i--) {
            result[i]=rightProduct*result[i];
            rightProduct=rightProduct*nums[i];
        }
        return result;
    }
    public static boolean increasingTriplet() {
        int[] nums= new int[]{2,1,5,0,4,6};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        ArrayList ll=new ArrayList();
        for (int num : nums) {

            if (num <= first) {
                first = num;
            }
            else if (num <= second) {
                second = num;
            }
            else {
                ll.add(first);
                ll.add(second);
                ll.add(num);
                System.out.println(ll);
                return true;
            }

        }

        return false;
    }
    public static void stringCount(){
        char[] charString = {'a','a','b','b','c','c','c'};
        new String(charString)
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        char[] chars = {'a','a','b','b','c','c','c'};

        int count = 1;
char[] ch=new char[chars.length];
int sum=2;
        for (int i = 1; i < chars.length; i++) {

            if (chars[i] == chars[i - 1]) {
                count++;
                sum++;
            } else {
                System.out.println(chars[i - 1] + " = " + count);
                count = 1;
            }
        }

        System.out.println(chars[chars.length - 1] + " = " + count);
        System.out.println(sum);
    }
}
