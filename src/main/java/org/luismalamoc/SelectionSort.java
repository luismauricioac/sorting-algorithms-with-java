package org.luismalamoc;

public class SelectionSort<T extends Comparable<T>> {

    public final T[] arr;

    public SelectionSort(T[] arr) {
        this.arr = arr;
    }

    public void sort(){
        for(int i = 0; i < arr.length -1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){ // ascending order
                    minIndex = j;
                }
            }
            //swapping
            if(minIndex != i){
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
