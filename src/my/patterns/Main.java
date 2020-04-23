package my.patterns;

import my.patterns.strategy.InsertionSortStrategy;
import my.patterns.strategy.MergeSortStrategy;
import my.patterns.strategy.SortStrategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SortStrategy strategy = new InsertionSortStrategy();
        System.out.println(Arrays.toString(strategy.doSort(new int[]{56,2,45,21,2,-44,0,53,1,6})));
    }
}
