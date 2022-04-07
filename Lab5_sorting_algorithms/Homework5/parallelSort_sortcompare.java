package Lab5_sorting_algorithms.Homework5;

import java.util.Arrays;

public class parallelSort_sortcompare {
    public static void main(String[] args) {
        int[] list = new int[10000];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
        }
        int[] list1 = list;

    long begin, end, time;
    System.out.println("sorting");
    begin = System.nanoTime();
    Arrays.sort(list);
    end = System.nanoTime();
    time = end - begin;
    System.out.println("Time for sort " + time);
    
    long begin1, end1, time1;
    System.out.println("sorting");
    begin1 = System.nanoTime();
    Arrays.parallelSort(list1);
    end1 = System.nanoTime();
    time1 = end1 - begin1;
    System.out.println("Time for parallelSort " + time1);
    }
}
