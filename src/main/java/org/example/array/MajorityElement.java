/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/majority-element/">...</a>
 */
public class MajorityElement {

    public static void demo() {

        System.out.println("\nDemo MajorityElement problem :");

        final int[] nums = { 7, 2, 7, 0, 2, 5, 7, 9 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums) {

        //  Store two variables for candidate and the count
        int count = 0, candidate = 0;

        //  Find the majority candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
