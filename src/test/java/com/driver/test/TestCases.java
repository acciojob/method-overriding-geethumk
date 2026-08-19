package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.driver.B;

public class TestCases {

    @Test
    public void testMethodOverriding() {
        B obj = new B();

        assertEquals(
                "Method is overridden in Extendend class B",
                obj.meth()
        );
    }
}