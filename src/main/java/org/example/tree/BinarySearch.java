/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.tree;

/**
 * <a href="https://leetcode.com/problems/binary-search/">...</a>
 */
public class BinarySearch {

    public static void demo() {

        System.out.println("\nDemo BinarySearch problem :");
        final int[] nums = new int[] { 2, 4, 7, 12, 19 };
        System.out.print(solution(nums, 12));
    }

    /**
     * O(log(n)) complexity + O(1) space solution
     */
    static int solution(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            //  Find the middle element
            final int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            //  Concentrate on the right subarray
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //  Concentrate on the left subarray
                end = mid - 1;
            }
        }

        return -1;
    }
}
