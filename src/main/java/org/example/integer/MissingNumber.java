/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.integer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/missing-number/">...</a>
 */
public class MissingNumber {

    public static void demo() {

        System.out.println("\nDemo MissingNumber problem :");

        final int[] nums = new int[] { 3, 5, 1, 2, 0 };

        System.out.println(naiveSolution(nums));
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums) {
        final int actualSum = Arrays.stream(nums).sum();
        final int allElementsSum = (nums.length * (nums.length + 1)) / 2;
        return allElementsSum - actualSum;
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static int naiveSolution(int[] nums) {

        final Set<Integer> distinctValueSet = new HashSet<>();

        //  The value appears 1 time in the nums array
        Arrays.stream(nums).forEach(distinctValueSet::add);

        for (int i = 0; i <= nums.length; ++i)  {
            if (! distinctValueSet.contains(i)) {
                return i;
            }
        }

        return 0;
    }
}
