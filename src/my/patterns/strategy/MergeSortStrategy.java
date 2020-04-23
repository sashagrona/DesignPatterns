package my.patterns.strategy;

import java.util.Arrays;

public class MergeSortStrategy implements SortStrategy {
    @Override
    public int[] doSort(int[] array) {
        if (array.length < 2){
            return array;
        }
        int middleIndex = array.length/2;
        int [] left = Arrays.copyOfRange(array, 0, middleIndex);
        int [] right = Arrays.copyOfRange(array, middleIndex, array.length);
        return merge(doSort(left), doSort(right));
    }
    public int [] merge(int [] left, int [] right){
        int [] array = new int[left.length + right.length];
        int j = 0;
        int k = 0;
        for (int i =0; i< array.length;i++){
            if (j == left.length){
                array[i] = right[k];
                k++;
            }else if(k == right.length){
                array[i] = left[j];
                j++;
            }else {
                if (left[j] < right[k]) {
                    array[i] = left[j];
                    j++;
                } else {
                    array[i] = right[k];
                    k++;
                }
            }
        }
        return array;
    }

}
