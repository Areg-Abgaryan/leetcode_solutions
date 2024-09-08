/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/monotonic-array/">...</a>
 */
public class MonotonicArray {

    public static void demo() {

        System.out.println("\nDemo MonotonicArray problem :");

        final int[] nums = { 1, 2, 2, 3, 4, 4, 5 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static boolean solution(int[] nums) {

        //  Simple case
        if (nums.length < 3) return true;

        //  Variables to track whether the array is ascending or descending
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < nums.length; ++i) {
            //  Stop. The array is neither descending nor ascending
            if (!isDescending && !isAscending) return false;

            //  Breaks the monotonic descending rule
            if (nums[i] > nums[i - 1]) {
                isDescending = false;
            }
            //  Breaks the monotonic ascending rule
            else if (nums[i] < nums[i - 1]) {
                isAscending = false;
            }
        }

        //  The array is monotonic if it's either increasing or decreasing
        return isAscending || isDescending;
    }
}
