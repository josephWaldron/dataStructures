package Lab2;

import java.util.List;

public class linearSearch {
  /** The method for finding a key in the list */
  public static int linearSearch1(int[] list, int key) {
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        return i;
    }
    return -1;
  }

public static int recursiveLinearSearch1(int list[], int key, int index){   //added index variable
  if(list[index] == key){   //checks if list[index] is = to the key
    return index;
  }
  else if(index + 1 < list.length)return recursiveLinearSearch1(list, key, index + 1);    //if not check if it will in bounds add 1 to the index and run again
  else return -1;   //if key is not found
  }

  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (key < list[mid])
        high = mid - 1;
      else if (key == list[mid])
        return mid;
      else
        low = mid + 1;
    }

    return -low - 1; // Now high < low
  }
  public static int[] sort(int[] list){   //I will be using insertion sort
    for(int i = 1; i < list.length; i++){
      int key = list[i];
      int j = i - 1;
      while(j >= 0 && list[j] > key){
        list[j + 1] = list[j];
        j = j - 1;
      }
      list[j + 1] = key;
    }
    return list;
  }
  public static void selectionSort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      int currentMin = list[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
  public static void main(String[] args) {
    final int N[] = {10, 100, 1000, 10000, 100000, 1000000, 10000000};
    final int KEY = 150;
    String matrix[][] = new String[4][8];
    matrix[0][0] = "N";   //populating results matrix
    matrix[0][1] = String.valueOf(N[0]);
    matrix[0][2] = String.valueOf(N[1]);
    matrix[0][3] = String.valueOf(N[2]);
    matrix[0][4] = String.valueOf(N[3]);
    matrix[0][5] = String.valueOf(N[4]);
    matrix[0][6] = String.valueOf(N[5]);
    matrix[0][7] = String.valueOf(N[6]);
    matrix[1][0] = "Worst";
    matrix[2][0] = "Best";
    matrix[3][0] = "Average";
    long worstResults[] = new long[7];//create arrays with final times
    long bestResults[] = new long[7];
    for(int i = 0; i < N.length; i++){    //run searches
      bestResults[i] = bestCase(N[i], KEY);
      worstResults[i] = worstCase(N[i], KEY);
    }
    matrix[1][1] = String.valueOf(worstResults[0]);//populating results matrix
    matrix[1][2] = String.valueOf(worstResults[1]);
    matrix[1][3] = String.valueOf(worstResults[2]);
    matrix[1][4] = String.valueOf(worstResults[3]);
    matrix[1][5] = String.valueOf(worstResults[4]);
    matrix[1][6] = String.valueOf(worstResults[5]);
    matrix[1][7] = String.valueOf(worstResults[6]);

    matrix[2][1] = String.valueOf(bestResults[0]);//populating results matrix
    matrix[2][2] = String.valueOf(bestResults[1]);
    matrix[2][3] = String.valueOf(bestResults[2]);
    matrix[2][4] = String.valueOf(bestResults[3]);
    matrix[2][5] = String.valueOf(bestResults[4]);
    matrix[2][6] = String.valueOf(bestResults[5]);
    matrix[2][7] = String.valueOf(bestResults[6]);

    matrix[3][1] = String.valueOf(average(bestResults[0], worstResults[0]));//populating results matrix
    matrix[3][2] = String.valueOf(average(bestResults[1], worstResults[1]));
    matrix[3][3] = String.valueOf(average(bestResults[2], worstResults[2]));
    matrix[3][4] = String.valueOf(average(bestResults[3], worstResults[3]));
    matrix[3][5] = String.valueOf(average(bestResults[4], worstResults[4]));
    matrix[3][6] = String.valueOf(average(bestResults[5], worstResults[5]));
    matrix[3][7] = String.valueOf(average(bestResults[6], worstResults[6]));
    System.out.println("\n\n");
    int row, colum;     //print final table
      for(row = 0; row < matrix.length; row++){
          for(colum = 0; colum < matrix[row].length; colum++){
              System.out.printf("%-20s", matrix[row][colum]);
          }
          System.out.println();
      }
   }
  public static long bestCase(int N, int KEY){    //best case
    int[] list = new int[N];
    // list[0] = 150; //best case
    for(int i = 0; i < list.length; i++){
      list[i] = 150;
    }
    long begin, end, time;
    begin = System.nanoTime();
  //Start timer
    System.out.println(binarySearch(list, KEY));
    end = System.nanoTime();
    time = end - begin;
    System.out.println("It took " + time + " nanoseconds to run linear search with the key " + KEY + " on an array with " + N + " elements.");
    return time;
  }
  public static long worstCase(int N, int KEY){   //worst case
    int[] list = new int[N];
    for(int i = 0; i < N; i++){  //worst case
      //generate random numbers from -100 to 100
      list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
      // System.out.println(list[i]);
    }
    long begin, end, time;
    System.out.println("sorting");
    begin = System.nanoTime();
    list = sort(list);
    //Start timer
    System.out.println(binarySearch(list, KEY));
    end = System.nanoTime();
    time = end - begin;
    System.out.println("It took " + time + " nanoseconds to run linear search with the key " + KEY + " on an array with " + N + " elements.");
    return time;
  }
  public static long average(long case1, long case2){
    return (case1 + case2) / 2;
  }
}
