package org.luismalamoc;

public class BubbleSort <T extends Comparable<T>> {

    public final T[] arr;

    public BubbleSort(T[] arr) {
        this.arr = arr;
    }

    public void sort(){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean didSwap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                // ascending
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }
    }
}
