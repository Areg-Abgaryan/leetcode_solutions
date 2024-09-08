/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.integer;

/**
 * <a href="https://leetcode.com/problems/check-if-the-number-is-fascinating/">...</a>
 */
public class IsFascinatingNumber {

    public static void demo() {

        System.out.println("\nDemo IsFascinatingNumber problem :");

        final int num = 192;
        System.out.println(solution(num));
    }

    /**
     * O(1) complexity + O(1) space solution
     */
    static boolean solution(int num) {

        //  Simple cases
        if (num > 333) return false;
        if (String.valueOf(num).endsWith("0")) return false;

        //  Concatenate 3 numbers to get the candidate
        final String concatenated = Integer.toString(num) + (2 * num) + 3 * num;

        //  Only number with 9 digits can be fascinating
        if (concatenated.length() != 9) return false;

        //  Init a boolean array of size 9 for numbers from 1 to 9
        boolean[] numsToNine = new boolean[9];
        for (int i = 0; i < concatenated.length(); ++i) {
            final int c = concatenated.charAt(i) - '0';
            //  Return false if the value under the corresponding index is 0
            //  or exists already in the array
            if (c == 0) return false;
            if (numsToNine[c - 1]) return false;

            //  Otherwise - reset to true
            numsToNine[c - 1] = true;
        }

        return true;
    }
}
