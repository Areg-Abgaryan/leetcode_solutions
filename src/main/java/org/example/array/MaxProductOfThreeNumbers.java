/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/maximum-product-of-three-numbers/">...</a>
 */
public class MaxProductOfThreeNumbers {

    public static void demo() {

        System.out.println("\nDemo MaxProductOfThreeNumbers problem :");

        final int[] nums = { 1, 2, -7, 3, 4, 4, -8, 6, 6 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums) {

        //  Find 3 max and 2 min numbers in the array
        int max = Integer.MIN_VALUE, max2 = max, max3 = max;
        int min = Integer.MAX_VALUE, min2 = min;

        for (int x : nums) {
            //  Assign 3 max values
            if (x >= max) {
                max3 = max2;
                max2 = max;
                max = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x >= max3) {
                max3 = x;
            }

            //  Assign 2 min values
            if (x < min) {
                if (x > min2) {
                    min = x;
                } else {
                    min = min2;
                    min2 = x;
                }
            }
        }

        return Math.max(max * max2 * max3, max * min * min2);
    }
}
