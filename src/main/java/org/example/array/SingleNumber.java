/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/single-number/">...</a>
 */
public class SingleNumber {

    public static void demo() {

        System.out.println("\nDemo SingleNumber problem :");

        final int[] nums = { 1, 2, 3, 6 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums) {

        //  XOR all elements with the answer.
        //  The elements with frequency = 2 will result in 0.
        //  And then the only element with frequency = 1 will generate the answer.
        int ans = 0;

        //  a ^ a = 0 | a ^ b ^ a = b | (a ^ a ^ b) = (b ^ a ^ a) = (a ^ b ^ a) = b

        for (int x : nums) {
            ans ^= x;
        }

        return ans;
    }
}
