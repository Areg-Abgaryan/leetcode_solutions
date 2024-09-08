/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.set;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate/">...</a>
 */
public class ContainsDuplicate {

    public static void demo() {

        System.out.println("\nDemo ContainsDuplicate problem :");

        final int[] nums = { 1, 2, 3, 6, 3 };
        System.out.println(solution(nums));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static boolean solution(int[] nums) {

        //  Store the unique values in the set and check whether next value already exists there
        final Set<Integer> numsSet= new HashSet<>();
        for (int x : nums) {
            if (numsSet.contains(x)) return true;
            else numsSet.add(x);
        }

        return false;
    }
}
