package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

public class AssertTests {
    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are not equal", "text", "text");
    }

    @Test
    public void testAssertNotSame()

    {
        List languages = new ArrayList<>();
        List moreLanguages = new ArrayList<>();

        assertNotSame("should not be same Object", "languages", "moreLanguages");

    }
    @Test
    public void testAssertSame()
    {
         List Languages = new ArrayList<>();

        assertSame("should not be same Object", "Languages", "Languages");
    }
    @Test
    public  void testAssertArrayEquals()
    {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers,otherNumbers);

    }
    @Test
    public void testAssertTure() {
        String language = "PHP";
        assertTrue("failure - should be true",language.contains("H"));
    }

    @Test
    public  void testAssertFalse()
    {
        String language = "PHP";
        language.contains("J");
        assertFalse("failure - should be false",language.contains("j"));
    }
}

