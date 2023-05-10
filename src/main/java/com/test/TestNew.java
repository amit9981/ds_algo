package com.test;


/*Consider system A which is giving you large collection of product IDs String like ["P1","P2",..,"Pn"] -
        Note : For this program you have to generate this product IDs collection of size N(1<N<1000)
        programmatically first.
        Consider system B which is down stream system, and taking these product IDs in input but only in chunk size
        of 10 not more than that.For this system write snippet which
        can split this product IDs collection into subList of size
        10 and print all the subList's content on console.

        Example
        Input : N = 23
        Output: [[P1…P10],[P11…P20],[P21..P23]
        Input : 30
        Output: [[P1…P10],[P11…P20],[P21..P30]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestNew {
    public static void main(String[] args) {
        ArrayList finalList=new ArrayList();

     int sumnum=0;
     int tencount=0;
        List inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23);
        for (int i = 0; i <=inputList.size()/10; i++) {
            ArrayList newList=new ArrayList();
            for (int j = sumnum; j <inputList.size(); j++) {
                newList.add(inputList.get(j));
                tencount++;
                if(tencount%10==0){
                    break;
                }
                if(sumnum>inputList.size()){
                    break;
                }
            }
            finalList.add(newList);
            sumnum+=10;
        }
        System.out.println("finalList "+finalList);

    }

}
