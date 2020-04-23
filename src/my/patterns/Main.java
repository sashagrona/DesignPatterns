package my.patterns;

import my.patterns.strategy.QuickSortStrategy;
import my.patterns.strategy.SortStrategy;
import my.patterns.template.Facebook;
import my.patterns.template.LinkedIn;
import my.patterns.template.SocialNetwork;

public class Main {

    public static void main(String[] args) {
        SortStrategy strategy = new QuickSortStrategy();
        strategy.doSort(new int[]{56,2,45,21,2,-44,0,53,1,6});
    }
}
