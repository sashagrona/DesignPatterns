package my.patterns.strategy;

import java.util.Arrays;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public int[] doSort(int[] array) {
       return quickSort(array, 0, array.length-1);
    }

    public int [] quickSort(int [] array, int startIndex, int endIndex){
        int pivotIndex = startIndex + (endIndex - startIndex)/2;
        int i = startIndex;
        int j = endIndex;
        while (i<=j){
            while (array[i]<array[pivotIndex]){
                i++;
            }
            while (array[j] > array[pivotIndex]){
                j--;
            }
            if (i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (i<endIndex){
            quickSort(array, i, endIndex);
        }
        if (j>startIndex){
            quickSort(array, startIndex, j);
        }
        return array;
    }
}





