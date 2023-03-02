package com.java.api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class TestSC {
    public static void main(String[] args) {
        //l1 1->2->3-nulll2 4->5-6->null
        LinkedList<Integer> l1= new LinkedList();//123
        l1.add(1);l1.add(2);l1.add(3);
        LinkedList<Integer> l2= new LinkedList();//456
        l2.add(4);l2.add(5);l2.add(6);
        LinkedList<Integer> l3= new LinkedList<>();//5,1,

        Iterator iterator=l1.iterator();
        Iterator iterator2=l1.iterator();

        int a=0;
        int b=0;

        while (iterator.hasNext()){
            a*=10;
               a+=(int)iterator.next();

             }
        while (iterator2.hasNext()){
            b*=10;
            b+=(int)iterator2.next();
        }
       int result= add(a,b);
        LinkedList list=createList(result);
        System.out.println("Final result "+list);

    }
    public static LinkedList createList(int result){
        LinkedList<Integer> list= new LinkedList<>();//579,

        while(result!=0 ) {
            int val = result % 10;  //
            list.addFirst(val);
            result=result/10;
        }
        return list;
    }

    public static int add(int a,int b){
        return a+b;
    }
}
