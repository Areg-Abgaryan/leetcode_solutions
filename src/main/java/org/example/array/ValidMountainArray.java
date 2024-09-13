/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/valid-mountain-array/">...</a>
 */
public class ValidMountainArray {

    public static void demo() {

        System.out.println("\nDemo ValidMountainArray problem :");

        final int[] nums = { 1, 2, 2, 3, 2, 1 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static boolean solution(int[] nums) {

        //  Simple cases
        if (nums.length < 2) return false;
        if (nums[0] >= nums[1]) return false;
        if (nums[nums.length - 2] <= nums[nums.length - 1]) return false;

        //  Store a flag for monitoring the sequence order
        boolean isAscending = true;

        //  Iterate over array
        for (int i = 1; i < nums.length; ++i) {
            if (isAscending) {
                //  Change the isAscending flag to false if the peak is reached
                if (nums[i] <= nums[i - 1]) {
                    isAscending = false;
                }
            } else {
                //  Check whether the sequence is ascending after the peak is reached
                if (nums[i - 1] <= nums[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
