package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    App app = new App();

    @Test
    public void testAddMe() {
        assertEquals(5.0, app.AddMe(2, 3), 0);
    }

    @Test
    public void testSubMe() {
        assertEquals(1.0, app.subMe(3, 2), 0);
    }
}