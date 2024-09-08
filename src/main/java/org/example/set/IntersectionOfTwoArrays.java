/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/">...</a>
 */
public class IntersectionOfTwoArrays {

    public static void demo() {

        System.out.println("\nDemo IntersectionOfTwoArrays problem :");

        final int[] num1 = new int[] { 2, 4, 17, 17, 19 };
        final int[] num2 = new int[] { 17, -1, 7, 12, 2 };

        System.out.println(Arrays.toString(solution(num1, num2)));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static int[] solution(int[] nums1, int[] nums2) {
        final Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        final Set<Integer> resultSet = new HashSet<>();

        for (int elem : nums2) {
            if (nums1Set.contains(elem)) {
                resultSet.add(elem);
                nums1Set.remove(elem);
            }
        }

        return resultSet.stream()
                .mapToInt(Integer::intValue)  // Convert Integer to int
                .toArray();
    }
}
