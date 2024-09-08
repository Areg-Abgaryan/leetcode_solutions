/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

public class ValidPalindrome {

    public static void demo() {

        System.out.println("\nDemo ValidPalindrome problem :");

        final String str = "A man, a plan, a canal: Panama";
        System.out.println("Is string " + str + " palindrome? " + solution("A man, a plan, a canal: Panama"));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static boolean solution(String str) {
        //  Get rid of redundant symbols
        final var sb = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            final char symbol = str.charAt(i);
            if (isCharAlphaNumeric(symbol)) {
                sb.append(Character.toLowerCase(symbol));
            }
        }

        //  Check whether is palindrome
        for (int i = 0; i < sb.length() / 2; ++i) {
            if (sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isCharAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
