package com.job2026.leet75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies)
                .max()
                .getAsInt();

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy  >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        ExtraCandy obj = new ExtraCandy();

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(obj.kidsWithCandies(candies, extraCandies));
    }
}
