package com.ds.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,3,5,7);
        List<Integer> l2= Arrays.asList(2,4,6,8,10);
        ArrayList<Integer> Itmerge = new ArrayList<>();
        Iterator i = l1.iterator();
        int k=0,j=1;
        while (i.hasNext()) {
            Itmerge.add(k,(int)i.next());
            k+=2;
        }
        i=l2.iterator();
        while (i.hasNext()) {
            Itmerge.add(j,(int)i.next());
            j=+2;
        }
        System.out.println("L1 : "+l1);
        System.out.println("L2 : "+l2);
        System.out.println("Merged : "+Itmerge);    }
}
