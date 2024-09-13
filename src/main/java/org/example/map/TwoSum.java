/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">...</a>
 */
public class TwoSum {

    public static void demo() {

        System.out.println("\nDemo TwoSum problem :");

        final int[] nums = new int[] { 3, 2, 4 };
        final int[] indices = solution(nums, 6);
        System.out.print(Arrays.toString(indices));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static int[] solution(int[] nums, int target) {

        final Map<Integer, Integer> value2IndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            final int searchValue = target - nums[i];
            //  If the map doesn't contain the search value, add it && proceed to the next element
            if (value2IndexMap.containsKey(searchValue)) {
                final int index = value2IndexMap.get(searchValue);
                return new int[] { i, index };
            } else {
                value2IndexMap.put(nums[i], i);
            }
        }
        return null;
    }

    /**
     * O(n^2) complexity solution + O(1) space solution
     */
    static int[] naiveSolution(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int g = i + 1; g < nums.length; ++g) {
                if (nums[i] + nums[g] == target) {
                    return new int[] { i, g };
                }
            }
        }
        return null;
    }
}
