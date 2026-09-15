/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Rana
 */
public class StringUtilsTest {

    @Test
    public void testJoinStrings() {

        List<String> words = Arrays.asList(
                "Java",
                "JUnit",
                "Testing"
        );

        String result = StringUtils.joinStrings(words, ", ");

        assertEquals(
                "Java, JUnit, Testing",
                result
        );
    }

    @Test
    public void testJoinStringsWithSingleElement() {

        List<String> words = Arrays.asList("Java");

        String result = StringUtils.joinStrings(words, ", ");

        assertEquals("Java", result);
    }
}
