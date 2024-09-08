/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/defanging-an-ip-address/">...</a>
 */
public class DefangingAnIpAddress {

    public static void demo() {

        System.out.println("\nDemo DefangingAnIpAddress problem :");

        System.out.println(solution("255.100.50.0"));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static String solution(String address) {
        final var sb = new StringBuilder(21);
        for (int i = 0; i < address.length(); ++i) {
            final char symbol = address.charAt(i);
            if (symbol == '.') {
                sb.append("[.]");
            } else {
                sb.append(symbol);
            }
        }
        return sb.toString();
    }
}
