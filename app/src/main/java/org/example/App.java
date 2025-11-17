
package org.example;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class App {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Original: " + numbers);
        System.out.println("After removing duplicates: " + removeDuplicates(numbers));

        ArrayList<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("A");
        System.out.println("Original: " + strList);
        System.out.println("After removing duplicates: " + removeDuplicates(strList));
    }
}
