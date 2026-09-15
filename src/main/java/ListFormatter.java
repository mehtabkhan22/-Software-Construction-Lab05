/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rana
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFormatter {

    /**
     * Sorts the given list in place.
     *
     * @param lst the list to sort
     */
    public static void sortInPlace(List<String> lst) {
        Collections.sort(lst);
    }

    /**
     * Returns a new list containing lowercase strings. The original list is not
     * modified.
     *
     * @param lst the original list
     * @return a new list containing lowercase strings
     */
    public static List<String> toLowerCase(List<String> lst) {

        List<String> result = new ArrayList<>();

        for (String word : lst) {
            result.add(word.toLowerCase());
        }

        return result;
    }
}
