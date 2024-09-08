/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">...</a>
 */
public class FindAllDisappearedNumbers {

    public static void demo() {

        System.out.println("\nDemo FindAllDisappearedNumbers problem :");

        final int nums[] = new int[] { 1, 1 };
        final List<Integer> disappearedNumbers = solution(nums);
        System.out.println(disappearedNumbers);
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static List<Integer> solution(int[] nums) {

        //  Init a boolean array with default false values
        final boolean[] numsOccur = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            numsOccur[nums[i] - 1] = true;
        }

        final List<Integer> result = new ArrayList<>();
        //  Check which number didn't occur in nums array
        for (int i = 0; i < numsOccur.length - 1; ++i) {
            if (! numsOccur[i]) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
