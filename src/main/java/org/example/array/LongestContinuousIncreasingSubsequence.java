/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/longest-continuous-increasing-subsequence/">...</a>
 */
public class LongestContinuousIncreasingSubsequence {

    public static void demo() {

        System.out.println("\nDemo LongestContinuousIncreasingSubsequence problem :");

        final int[] nums = { 1, 2, 7, 3, 0, 5, 6, 9 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums) {

        if (nums.length == 0) return 0;

        int current = 1, longestISS = 1;
        //  Iterate over and compare the elements with previous one
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
                ++current;
            } else {
                longestISS = Math.max(longestISS, current);
                current = 1;
            }
        }

        return Math.max(current, longestISS);
    }
}
