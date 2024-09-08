/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DefangingAnIpAddressTest {

    @Test
    void testStringWithDotsAtBeginningAndEnd() {
        final String ip = "192.168.0.17";
        final String expectedIp = "192[.]168[.]0[.]17";
        Assertions.assertEquals(expectedIp, DefangingAnIpAddress.solution(ip));
    }

}
