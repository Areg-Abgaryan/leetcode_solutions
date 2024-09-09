/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.set;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/">...</a>
 */
public class LargestPositiveWithItsNegative {

    public static void demo() {

        System.out.println("\nDemo LargestPositiveWithItsNegative problem :");

        final int[] nums = { 1, 2, 3, -2, 3 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static int solution(int[] nums) {

        int max = -1;
        final Set<Integer> numsSet = new HashSet<>();
        for (int x : nums) {
            //  Check whether the set contains the opposite element, compare with the max
            if (numsSet.contains(-x)) {
                if (Math.abs(x) > max) {
                    max = Math.abs(x);
                }
            }
            //  Put in the set
            numsSet.add(x);
        }

        return max;
    }
}
