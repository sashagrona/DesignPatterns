package my.patterns.strategy;

public class InsertionSortStrategy implements SortStrategy {
    @Override
    public int[] doSort(int[] array) {
        for (int i=1;i<array.length;i++){
            int j = i-1;
            int temp = array[i];
            while (j>=0){
                if (temp<array[j]){
                    array[j+1] = array[j];
                }else {
                    break;
                }
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    }
}
