/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/most-frequent-even-element/">...</a>
 */
public class MostFrequentEvenElement {

    public static void demo() {

        System.out.println("\nDemo MostFrequentEvenElement problem :");

        final int[] nums = new int[] { 0, 1, 2, 2, 4, 4, 1 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static int solution(int[] nums) {

        //  Put all odd even elements in a hashmap
        final Map<Integer, Integer> num2ValueMap = new HashMap<>();
        Arrays.stream(nums)
                .filter(x -> x % 2 == 0)
                .forEach(x -> num2ValueMap.put(x, num2ValueMap.getOrDefault(x, 0) + 1));

        if (num2ValueMap.isEmpty()) {
            return -1;
        }

        //  Find the smallest most frequent number
        int minKey = Integer.MAX_VALUE, maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : num2ValueMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                if (entry.getKey() < minKey) {
                    minKey = entry.getKey();
                }
            } else if (entry.getValue() > maxValue) {
                minKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return minKey;
    }
}
