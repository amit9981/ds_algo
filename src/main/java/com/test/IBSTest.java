package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IBSTest {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Apples", "CSS", "HTML", "Oracle", "Dart");
       // printDuplicate();
        printDistinct();
       /* https://www.benchresources.net/java-8-how-to-sort-list-and-arrays-with-null-values/
       compairing multiple level
       https://www.benchresources.net/java-8-sorting-list-of-objects-on-multiple-fields/

*/



        /*Collections.sort(strList, Comparator.comparingInt(String::length));
        System.out.println(strList);

        strList.sort((str1, str2) -> Integer.compare(str1.length(), str2.length()));


        // 2.1 print ascending-order sorted Strings by its Length
        System.out.println("\nAscending-order Sorted String List "
                + "by its Length :- \n" + strList + "\n");*/

        List<String> ascSortedList = strList
                .stream()
                .sorted((str1, str2) -> str1.length() - str2.length())
                .collect(Collectors.toList());
strList.stream().sorted((s1,s2)->Integer.compare(s1.length(),s2.length())).collect(Collectors.toList());
        System.out.println("====");
        System.out.println(strList.stream().max((s1,s2)->s1.compareTo(s2)).get());
        System.out.println(strList.stream().max((s1,s2)->Integer.compare(s1.length(),s2.length())).get());
        System.out.println(ascSortedList);


        // 3. sorting String List in Descending-order
        strList.sort((str1, str2) -> Integer.compare(str2.length(), str1.length()));
        System.out.println(strList);
        /*
        int[] ll = {1, 1, 3, 2, 2, 5, 4, 4, 7, 6, 6, 9, 8, 8, 10, 13};
        int[] newArrays = new int[ll.length + 1];
        int[] u = new int[ll.length + 1];

        int k = 0;
        boolean flag = false;
        for (int i = 0; i < ll.length; i++) {
            for (int j = 0; j < i; j++) {
                if (newArrays[j] == ll[i]) {
                    flag = true;
                   // continue;
                }else {
                    u[i]=newArrays[j];
                }
            }
        }
        for (int i = 0; i < newArrays.length; i++) {
            System.out.print(u[i]);
            System.out.print(" ");
        }*/
    }

    static void printDistinct() {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        // Pick all elements one by one
        for (int i = 0; i < n; i++) {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print("hi "+arr[i] + " ");
        }
    }

    static void printDuplicate() {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
    // Driver program

}
