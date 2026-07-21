package com.ds.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergeTwoList {
    public static void main(String[] args) {
        /*we can merge the list while using l1.addAll(l2)
        * but now it will give run time error because l1 and l2 size is fixed we decided
        * if we want to add the we should use like below formate
        * List<Integer> l1= new ArrayList<>(Arrays.asList(1,3,5,7));
        *         List<Integer> l1= new ArrayList<>(Arrays.asList(1,3,5,7));
         * */
        List<Integer> l1= Arrays.asList(1,3,5,7);
        List<Integer> l2= Arrays.asList(2,4,6,8,10);
        ArrayList<Integer> Itmerge = new ArrayList<>();
        Iterator i = l1.iterator();
        l1.addAll(l2);
        int k=0;
        while (i.hasNext()) {
            Itmerge.add(k,(int)i.next());
            k+=1;
        }
        i=l2.iterator();
        int j=k+1;
        while (i.hasNext()) {
            Itmerge.add(j,(int)i.next());
            j=+1;
        }
        System.out.println("L1 : "+l1);
        System.out.println("L2 : "+l2);

        System.out.println("Merged : "+Itmerge);    }
}
