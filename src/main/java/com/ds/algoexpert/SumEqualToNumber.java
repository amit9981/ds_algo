package com.ds.algoexpert;

import java.util.*;

public class SumEqualToNumber {
    public static void main(String[] args) {
        System.out.println(isNumberPressent(Arrays.asList(1,6,3,4,7,9),10));

    }
    public static boolean isNumberPressent(List l, int a){
        boolean isPresent=false;
        Set<Integer> resultSet = new HashSet();

        l.stream().forEach(i-> {
           int sub= a-(Integer) i;
        //   resultSet.
        });


        for(int i=0; i<l.size() ;i++){
            int subtract = a- (int)l.get(i);
            if(resultSet.contains(subtract)){
                 isPresent=true;
                System.out.println(subtract+ " "+(l.get(i)));
                //return new int[]{l[i],subtract};
            }else{
                resultSet.add((Integer) l.get(i));
            }
        }
        return isPresent;
    }


}
