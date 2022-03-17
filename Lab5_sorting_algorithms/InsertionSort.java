package Lab5_sorting_algorithms;

public class InsertionSort {
    /** The method for sorting the numbers */
    public static void insertionSort(int[] list) {
      for (int i = 1; i < list.length; i++) {
        /** insert list[i] into a sorted sublist list[0..i-1] so that
            list[0..i] is sorted. */
        int currentElement = list[i];
        int k;
        for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
          list[k + 1] = list[k];
        }
  
        // Insert the current element into list[k+1]
        list[k + 1] = currentElement;
      }
    }
    
    /** A test method */
    public static void main(String[] args) {
      int number = 10000000;
      int[] list = new int[number];
      for (int i = 0; i < list.length; i++) {
        list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
      }
      System.out.println("list created");
      insertionSort(list);
      System.out.println("original sort finished");
      list = reverseList(list, list.length);
      System.out.println("List reversed");
      // for (int i = 0; i < list.length; i++)
      //   System.out.print(list[i] + " ");
      long begin, end, time;
    begin = System.nanoTime();
  //Start timer
      insertionSort(list);
    end = System.nanoTime();
    time = end - begin;
    System.out.println("It took " + time + " nanoseconds to sort a list of " + number + " elements using insertion sort.");
    //   for (int i = 0; i < list.length; i++)
    //     System.out.print(list[i] + " ");
    }
    public static int[] reverseList(int[] list, int length){
      int[] dest_array = new int[length];
      int j = length;
      for (int i = 0; i < length; i++) {
        dest_array[j - 1] = list[i];
        j = j - 1;
      }
      return dest_array;
    }
  }