package com.poimer.exampoimer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringifyRestControllerTests {


    @Test
    void testStringify() {
        // Given (Arrange)
        var controller = new StringifyRestController();
        var text = "hello";

        // When (Act)
        var result = controller.getModifiedString(text);

        // Then (Assert)
        assertEquals("hElLo", result);
    }

}
