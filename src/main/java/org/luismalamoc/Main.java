package org.luismalamoc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // BubbleSort
        Integer[] unorderedIntegers = { 10, 55, -5, 34, 7, 22, 19 };
        String[] unorderedStrings = { "Sylvanas", "Arthas", "Illian", "Thrall", "Jaina" };
        new BubbleSort<>(unorderedIntegers).sort();
        new BubbleSort<>(unorderedStrings).sort();
        System.out.println(Arrays.toString(unorderedIntegers) + " | " + Arrays.toString(unorderedStrings));
    }
}