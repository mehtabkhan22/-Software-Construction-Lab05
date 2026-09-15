/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rana
 */
public class SearchStrategiesTest {

    // Test 1: Both methods return different results
    // when the array contains duplicate values.
    @Test
    public void testDifferentResultsWithDuplicates() {
        int[] arr = {10, 20, 30, 20, 40};

        assertEquals(1, SearchStrategies.findFirst(arr, 20));
        assertEquals(3, SearchStrategies.findLast(arr, 20));
    }

    // Test 2: Both methods return the same result
    // when the element appears exactly once.
    @Test
    public void testSameResultsWithSingleOccurrence() {
        int[] arr = {10, 20, 30, 40};

        assertEquals(2, SearchStrategies.findFirst(arr, 30));
        assertEquals(2, SearchStrategies.findLast(arr, 30));
    }

    // Additional test: The value is missing.
    @Test
    public void testMissingValue() {
        int[] arr = {10, 20, 30, 40};

        assertEquals(arr.length, SearchStrategies.findFirst(arr, 50));
        assertEquals(-1, SearchStrategies.findLast(arr, 50));
    }
}
