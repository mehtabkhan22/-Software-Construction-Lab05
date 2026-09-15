/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rana
 */
public class ListFormatterTest {

    // Test that sortInPlace modifies the original list.
    @Test
    public void testSortInPlaceMutatesOriginalList() {

        List<String> words = new ArrayList<>(
                Arrays.asList("Banana", "Apple", "Cherry")
        );

        ListFormatter.sortInPlace(words);

        assertEquals(
                Arrays.asList("Apple", "Banana", "Cherry"),
                words
        );
    }

    // Test that toLowerCase does not modify the original list.
    @Test
    public void testToLowerCaseDoesNotMutateOriginalList() {

        List<String> original = new ArrayList<>(
                Arrays.asList("HELLO", "WORLD")
        );

        List<String> result = ListFormatter.toLowerCase(original);

        // Verify the returned list contains lowercase strings.
        assertEquals(
                Arrays.asList("hello", "world"),
                result
        );

        // Verify that the original list remains unchanged.
        assertEquals(
                Arrays.asList("HELLO", "WORLD"),
                original
        );
    }
}
