/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/move-zeroes/">...</a>
 */
public class MoveZeroes {

    public static void demo() {

        System.out.println("\nDemo MoveZeroes problem :");

        final int[] nums = new int[] { 1, 0, 5, 6 };
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static void solution(int[] nums) {

        //  Simple cases
        if (nums.length == 0 || nums.length == 1) {
            return;
        }

        int left = 0, right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                // Swap left and right elements only if they are different
                if (left != right) {
                    nums[left] = nums[left] + nums[right];
                    nums[right] = nums[left] - nums[right];
                    nums[left] = nums[left] - nums[right];
                }
                // Increment left after a non-zero is placed
                ++left;
            }
            // Move right pointer regardless of the swap
            ++right;
        }
    }
}
