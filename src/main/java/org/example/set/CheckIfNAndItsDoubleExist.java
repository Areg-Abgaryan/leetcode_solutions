/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.set;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/check-if-n-and-its-double-exist/">...</a>
 */
public class CheckIfNAndItsDoubleExist {

    public static void demo() {

        System.out.println("\nDemo CheckIfNAndItsDoubleExist problem :");

        final int[] nums = { 1, 2, 3, 6, 3 };
        System.out.println(solution(nums));
    }


    /**
     * O(n) complexity + O(n) space solution
     */
    static boolean solution(int[] nums) {

        //  Simple case
        if (nums.length < 2) return false;

        final Set<Integer> numbersSet = new HashSet<>();

        //  Return true if a match was found in the set, otherwise - put
        for (int x : nums) {
            if (numbersSet.contains(2 * x) || (x % 2 == 0 && numbersSet.contains(x / 2))) {
                return true;
            } else {
                numbersSet.add(x);
            }
        }

        //  No match was found
        return false;
    }
}
