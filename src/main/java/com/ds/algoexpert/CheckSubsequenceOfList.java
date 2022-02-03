package com.ds.algoexpert;

import java.util.Arrays;
import java.util.List;

public class CheckSubsequenceOfList {
    public static void main(String[] args) {
//        arr=[5, 1, 22, 25, 6, -1, 8, 10]
//        seq=[1, 6, -1, 10]
//        o/p=true

        System.out.println(isValidSubsequence(Arrays.asList(1,2,3,4,5),Arrays.asList(2,4));
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer>sequence){
        int arrIndex=0;
        int seqIndex=0;
        while (arrIndex<array.size()&&seqIndex<sequence.size()){
            if(array.get(arrIndex).equals(sequence.get(seqIndex))){
                seqIndex++;
            }
            arrIndex++;
        }
  return seqIndex==sequence.size();

    }
}
