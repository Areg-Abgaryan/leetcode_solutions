/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HappyNumberTest {

    @Test
    @Order(1)
    void testHappyNumber() {
        Assertions.assertTrue(HappyNumber.solution(19));
        Assertions.assertTrue(HappyNumber.solution(1));
        Assertions.assertFalse(HappyNumber.solution(2));
        Assertions.assertFalse(HappyNumber.solution(4));
        Assertions.assertTrue(HappyNumber.solution(23));
    }

    @Test
    @Order(2)
    void testEdgeCases() {
        Assertions.assertFalse(HappyNumber.solution(0));
        Assertions.assertFalse(HappyNumber.solution(-1));
        Assertions.assertTrue(HappyNumber.solution(7));
        Assertions.assertFalse(HappyNumber.solution(444));
    }
}
