/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/detect-capital/">...</a>
 */
public class DetectCapital {

    public static void demo() {

        System.out.println("\nDemo MostFrequentEvenElement problem :");

        final String str = "Google";
        System.out.println(solution(str));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static boolean solution(String word) {

        //  Simple cases
        if (word == null || word.isEmpty() || word.length() == 1) return true;

        //  First character is lowercase
        if (Character.isLowerCase(word.charAt(0))) {
            return allLowerCase(word, 1);
        } else {
            //  First character is uppercase, second is lowercase
            if (Character.isLowerCase(word.charAt(1))) {
                return allLowerCase(word, 2);
            } else {
                //  First 2 characters are uppercase
                for (int i = 2; i < word.length(); ++i) {
                    if (Character.isLowerCase(word.charAt(i)))
                        return false;
                }
            }
        }

        return true;
    }

    private static boolean allLowerCase(String word, int start) {
        for (int i = start; i < word.length(); ++i) {
            if (Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
