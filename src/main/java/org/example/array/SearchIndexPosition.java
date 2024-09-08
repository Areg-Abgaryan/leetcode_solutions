/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/search-insert-position/">...</a>
 */
public class SearchIndexPosition {

    public static void demo() {

        System.out.println("\nDemo SearchIndexPosition problem :");

        final int[] nums = new int[] { 1, 3, 5, 6 };
        final int target = 5;
        System.out.println(solution(nums, target));
    }

    /**
     * O(log(n)) complexity + O(1) space solution
     */
    static int solution(int[] nums, int target) {
        int start = 0, end = nums.length -1;

        int mid;
        while (start <= end ) {
            mid = (start + end) / 2;

            //  Return the index if the target is found in the array
            if (nums[mid] == target) {
                return mid;
            }

            //  Consider the left subarray
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                //  Consider the right subarray
                start = mid + 1;
            }
        }

        return start;
    }
}
