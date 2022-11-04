package org.luismalamoc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testSort() {
        Integer[] result1 = DataFixture.getUnorderedIntegers();
        String[] result2 = DataFixture.getUnorderedStrings();
        System.out.println("Unordered " + Arrays.toString(result1) + " | " + Arrays.toString(result2));
        new BubbleSort<>(result1).sort();
        new BubbleSort<>(result2).sort();
        assertArrayEquals(DataFixture.getOrderedIntegers(), result1);
        assertArrayEquals(DataFixture.getOrderedStrings(), result2);
        System.out.println("Ordered " + Arrays.toString(result1) + " | " + Arrays.toString(result2));
    }
}
