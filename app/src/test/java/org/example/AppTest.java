
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class AppTest {
    @Test
    void testRemoveDuplicates() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        ArrayList<Integer> result = App.removeDuplicates(numbers);

        assertEquals(3, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
    }
    @Test
    void testRemoveDuplicatesStrings() {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("A");

        ArrayList<String> result = App.removeDuplicates(strList);

        assertEquals(2, result.size());
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
    }
    @Test
    void testRemoveDuplicatesEmptyList() {
        ArrayList<Double> emptyList = new ArrayList<>();

        ArrayList<Double> result = App.removeDuplicates(emptyList);

        assertEquals(0, result.size());
    }
    @Test
    void testRemoveDuplicatesNoDuplicates() {
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('X');
        charList.add('Y');
        charList.add('Z');

        ArrayList<Character> result = App.removeDuplicates(charList);

        assertEquals(3, result.size());
        assertTrue(result.contains('X'));
        assertTrue(result.contains('Y'));
        assertTrue(result.contains('Z'));
    }
}
