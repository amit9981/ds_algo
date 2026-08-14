package com.job2026.leet75;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,2};
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> al=List.of(1,2,3,1,2);
        HashSet<Integer>set=new HashSet<>();
        System.out.println(Arrays.stream(nums).boxed().filter(p->Collections.frequency(Collections.singleton(nums),p)<2).collect(Collectors.toList()));
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),counting())));
        //System.out.println(Arrays.stream(nums).boxed().filter(p->Collections.frequency(Collections,p)<2).collect(Collectors.toList()));

        // System.out.println(al);
    }
}
