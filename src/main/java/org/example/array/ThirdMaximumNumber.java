/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/third-maximum-number/">...</a>
 */
public class ThirdMaximumNumber {

    public static void demo() {

        System.out.println("\nDemo ThirdMaximumNumber problem :");

        final int[] nums = { 1, 2, 2, 3, 4, 4, 4, 6, 6 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums) {

        //  Store 3 long variables for the case when an Integer.MIN_VALUE comes as an input
        long max = Long.MIN_VALUE, max2 = max, max3 = max;

        //  Iterate over array and reassign the variables accordingly
        for (int x : nums) {
            //  Check if the current number is greater than the first maximum
            if (x > max) {
                max3 = max2;
                max2 = max;
                max = x;
            }
            //  Check if the current number is between the 1st and 2nd maximums
            else if (x > max2 && x < max) {
                max3 = max2;
                max2 = x;
            }
            //  Check if the current number is between the 2nd and 3rd maximums
            else if (x > max3 && x < max2) {
                max3 = x;
            }
        }

        return max3 == Long.MIN_VALUE ? (int) max : (int) max3;
    }
}
