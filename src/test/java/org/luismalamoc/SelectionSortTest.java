package org.luismalamoc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testSort() {
        Integer[] result1 = DataFixture.getUnorderedIntegers();
        String[] result2 = DataFixture.getUnorderedStrings();
        System.out.println("Unordered " + Arrays.toString(result1) + " | " + Arrays.toString(result2));
        new SelectionSort<>(result1).sort();
        new SelectionSort<>(result2).sort();
        assertArrayEquals(DataFixture.getOrderedIntegers(), result1);
        assertArrayEquals(DataFixture.getOrderedStrings(), result2);
        System.out.println("Ordered " + Arrays.toString(result1) + " | " + Arrays.toString(result2));
    }
}
