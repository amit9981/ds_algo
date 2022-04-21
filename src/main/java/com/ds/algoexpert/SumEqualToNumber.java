package com.ds.algoexpert;

import java.util.*;

public class SumEqualToNumber {
    public static void main(String[] args) {
        System.out.println(isNumberPressent(Arrays.asList(1,2,5,4,5),10));

    }
    public static boolean isNumberPressent(List l, int a){
        boolean isPresent=false;
        Set<Integer> resultSet = new HashSet();

        for(int i=0; i<l.size() ;i++){
            int subtract = a- (int)l.get(i);
            if(resultSet.contains(subtract)){
                 isPresent=true;
                //return new int[]{l[i],subtract};
            }else{
                resultSet.add((int)l.get(i));
            }
        }
        return isPresent;
    }
}
