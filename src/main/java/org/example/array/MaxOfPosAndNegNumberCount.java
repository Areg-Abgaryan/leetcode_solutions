/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/">...</a>
 */
public class MaxOfPosAndNegNumberCount {

    public static void demo() {

        System.out.println("\nDemo MaxOfPosAndNegNumberCount problem :");

        final int[] nums = { 2, 4, -9, 2, 6, -2 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums) {

        //  Iterate over array and count positive and negative numbers quantity
        int posCount = 0, negCount = 0;
        for (int x : nums) {
            if (x > 0) ++posCount;
            else if (x < 0) ++negCount;
        }

        return Math.max(posCount, negCount);
    }
}
