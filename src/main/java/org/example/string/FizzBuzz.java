/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/fizz-buzz/">...</a>
 */
public class FizzBuzz {

    public static void demo() {

        System.out.println("\nDemo FizzBuzz problem :");

        final int number = 5;
        System.out.println(solution(number));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static List<String> solution(int number) {

        //  Simple case
        if (number < 1) return null;

        final List<String> result = new ArrayList<>(number);
        for (int i = 1; i <= number; ++i) {
            //  Cover all the cases
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
