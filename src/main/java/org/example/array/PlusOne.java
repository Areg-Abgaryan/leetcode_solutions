/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/plus-one/">...</a>
 */
public class PlusOne {

    public static void demo() {

        System.out.println("\nDemo PlusOne problem :");

        final int[] nums = new int[] { 1, 2, 2, 3, 1, 4 };
        System.out.println(Arrays.toString(solution(nums)));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int[] solution(int[] digits) {

        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                ++digits[i];
                return digits;
            } else {
                if (i != 0) {
                    digits[i] = 0;
                } else {
                    //  All elements initialized to 0
                    int[] answer = new int[digits.length + 1];
                    answer[0] = 1;
                    return answer;
                }
            }
        }

        return digits;
    }
}
