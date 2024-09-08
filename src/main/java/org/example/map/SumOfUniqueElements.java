/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/sum-of-unique-elements/">...</a>
 */
public class SumOfUniqueElements {


    public static void demo() {

        System.out.println("\nDemo SumOfUniqueElements problem :");

        final int[] nums = new int[] { 1, 2, 3, 2 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static int solution(int[] nums) {

        //  Create a map that would contain the numbers and their values
        final Map<Integer, Integer> num2ValueMap = new HashMap<>();
        Arrays.stream(nums).forEach(x -> num2ValueMap.put(x, num2ValueMap.getOrDefault(x, 0) + 1));

        //  Get the sum of all the keys the values of which are 1
        return num2ValueMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .sum();
    }
}
