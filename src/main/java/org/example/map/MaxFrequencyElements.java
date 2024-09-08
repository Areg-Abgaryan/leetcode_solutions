/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/count-elements-with-maximum-frequency/">...</a>
 */
public class MaxFrequencyElements {

    public static void demo() {

        System.out.println("\nDemo MaxFrequencyElements problem :");

        final int[] nums = new int[] { 1, 2, 2, 3, 1, 4 };
        System.out.print(solution(nums));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static int solution(int[] nums) {

        final Map<Integer, Integer> num2Frequency = new HashMap<>();

        //  Finding the frequency count for each number
        Arrays.stream(nums).forEach(x -> num2Frequency.put(x, num2Frequency.getOrDefault(x, 0) + 1));

        //  Find the max frequency count
        final int max = num2Frequency.values().stream()
                .mapToInt(val -> val)
                .filter(val -> val >= 0)
                .max().orElse(0);

        //  Iterate, collect and return sum
        return num2Frequency.values().stream()
                .mapToInt(val -> val)
                .filter(val -> val == max)
                .sum();
    }
}
