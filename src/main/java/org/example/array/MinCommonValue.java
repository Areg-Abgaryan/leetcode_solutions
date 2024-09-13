/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/minimum-common-value/">...</a>
 */
public class MinCommonValue {

    public static void demo() {

        System.out.println("\nDemo MinCommonValue problem :");

        final int[] nums1 = { 1, 2, 3, 6 };
        final int[] nums2 = { 2, 3, 4, 5 };
        System.out.println(solution(nums1, nums2));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] nums1, int[] nums2) {

        //  Initialize two pointers
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            //  Return the first common min number
            if (nums1[p1] == nums2[p2]) {
                return nums1[p1];
            }

            //  Move further first pointer
            if (nums1[p1] < nums2[p2]) {
                ++p1;
            }
            //  Move further second pointer
            else {
                ++p2;
            }
        }

        return -1;
    }
}
