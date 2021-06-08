package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestFile {

	@DisplayName("Test Hello.get()")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", Hello.get());
    }
}
