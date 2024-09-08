/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

public class MaxConsecutiveOnes {

    public static void demo() {

        System.out.println("\nDemo MaxConsecutiveOnes problem :");

        final int[] nums = { 1, 1, 1, 0 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums) {

        int oneCountMax = 0, oneCountTemp = 0;

        //  Iterate and find the longest subsequence of ones
        for (int x : nums) {
            if (x == 1) {
                ++oneCountTemp;
            } else {
                oneCountMax = Math.max(oneCountMax, oneCountTemp);
                oneCountTemp = 0;
            }
        }

        return Math.max(oneCountTemp, oneCountMax);
    }
}
