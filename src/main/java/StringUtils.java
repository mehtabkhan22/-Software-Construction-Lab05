/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rana
 */
import java.util.List;

public class StringUtils {

    /**
     * BAD / OPERATIONAL JAVADOC:
     *
     * First, create an empty result string. Then use a for loop to iterate
     * through every element of the words list. For each element, concatenate it
     * to the result string. Before adding each element after the first one, use
     * an if-statement to add the delimiter. This prevents a trailing delimiter
     * from being added after the final element.
     *
     * GOOD / DECLARATIVE JAVADOC:
     *
     * Returns the concatenation of elements in order, with the delimiter
     * inserted between each adjacent pair.
     *
     * @param words list of strings to join
     * @param delimiter string inserted between adjacent elements
     * @return concatenated string with delimiters between elements
     */
    public static String joinStrings(List<String> words, String delimiter) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {

            if (i > 0) {
                result.append(delimiter);
            }

            result.append(words.get(i));
        }

        return result.toString();
    }
}
