/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/count-the-number-of-special-characters-i/">...</a>
 */
public class SpecialCharactersInString {

    public static void demo() {
        System.out.println("\nDemo SpecialCharactersInString problem :");

        final String str = "eggEasdAcvqrxfvXV";
        System.out.println(solution(str));
    }

    /**
     * O(n) complexity + O(k) space solution
     */
    static int solution(String word) {

        //  Convert string to a set of characters
        final Set<Character> characters = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        int count = 0;
        for (var c : characters) {
            //  Check whether the character is lowercase
            if (Character.isLowerCase(c)) {
                if (characters.contains(Character.toUpperCase(c))) {
                    ++count;
                }
            } else if (Character.isUpperCase(c)){
                //  Check whether the character is uppercase
                if (characters.contains(Character.toLowerCase(c))) {
                    ++count;
                }
            }
        }

        return count / 2;
    }
}
