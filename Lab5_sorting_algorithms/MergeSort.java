package Lab5_sorting_algorithms;
public class MergeSort {
    /** The method for sorting the numbers */
    public static void mergeSort(int[] list) {
      if (list.length > 1) {
        // Merge sort the first half
        int[] firstHalf = new int[list.length / 2];
        System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
        mergeSort(firstHalf);
  
        // Merge sort the second half
        int secondHalfLength = list.length - list.length / 2;
        int[] secondHalf = new int[secondHalfLength];
        System.arraycopy(list, list.length / 2,
          secondHalf, 0, secondHalfLength);
        mergeSort(secondHalf);
  
        // Merge firstHalf with secondHalf into list
        merge(firstHalf, secondHalf, list);
      }
    }
  
    /** Merge two sorted lists */
    public static void merge(int[] list1, int[] list2, int[] temp) {
      int current1 = 0; // Current index in list1
      int current2 = 0; // Current index in list2
      int current3 = 0; // Current index in temp
  
      while (current1 < list1.length && current2 < list2.length) {
        if (list1[current1] < list2[current2])
          temp[current3++] = list1[current1++];
        else
          temp[current3++] = list2[current2++];
      }
  
      while (current1 < list1.length)
        temp[current3++] = list1[current1++];
  
      while (current2 < list2.length)
        temp[current3++] = list2[current2++];
    }
  
    /** A test method */
    public static void main(String[] args) {
        int number = 10000000;
      int[] list = new int[number];
      // for (int i = 0; i < list.length; i++) {
      //   list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
      // }
      int[] evenList = new int[number/2];
      for (int i = 0; i < evenList.length; i++) {
        evenList[i] = i*2;
      }
      int[] oddlist = new int[number/2];
      for (int i = 0; i < oddlist.length; i++) {
        oddlist[i] = evenList[i] + 1;
      }
      int index;
      for (index = 0; index < list.length/2; index++) {
        list[index] = evenList[index];
      }
      for (int i = 0; index < list.length; i++) {
         list[index] = oddlist[i];
         index ++;
      }
      // for (int j = 0; j < list.length; j++) {
      //    System.out.print(list[j] + " "); 
      // }
      long begin, end, time;
    begin = System.nanoTime();
  //Start timer
      mergeSort(list);
    end = System.nanoTime();
    time = end - begin;
    System.out.println("It took " + time + " nanoseconds to sort a list of " + number + " elements using merge sort. Worst case");
      // for (int i = 0; i < list.length; i++)
      //   System.out.print(list[i] + " ");
    }
  }