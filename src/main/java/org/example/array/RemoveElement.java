/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/remove-element/">...</a>
 */
public class RemoveElement {

    public static void demo() {

        System.out.println("\nDemo RemoveElement problem :");

        final int[] nums = new int[] { 1, 2, 2, 3, 1, 4 };
        final int val = 1;
        System.out.println(solution(nums, val));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums, int val) {

        int last = nums.length;
        for (int i = 0; i < nums.length;) {
            if (nums[i] == val) {
                nums[i] = nums[--last];
                nums[last] = Integer.MAX_VALUE;
            } else {
                ++i;
            }
        }

        return last;
    }
}
