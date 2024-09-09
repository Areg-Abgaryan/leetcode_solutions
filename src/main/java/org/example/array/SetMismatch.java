/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/set-mismatch/">...</a>
 */
public class SetMismatch {

    public static void demo() {

        System.out.println("\nDemo SetMismatch problem :");

        final int[] nums = { 1, 2, 3, -2, 3 };
        System.out.println(Arrays.toString(solution(nums)));
    }


    /**
     * O(n) complexity + O(n) space solution
     */
    static int[] solution(int[] nums) {

        int repeated = 0;

        //  Store a boolean array to find the repeating element
        boolean[] numsArray = new boolean[nums.length];
        for (int x : nums) {
            if (numsArray[x - 1]) {
                repeated = x;
            } else {
                numsArray[x - 1] = true;
            }
        }

        //  Find out which number is the missing one
        for (int g = 0; g < numsArray.length; ++g) {
            if (! numsArray[g]) {
                return new int[] { repeated, g + 1 };
            }
        }

        //  Invalid case
        return new int[] { -1, -1 };
    }
}
