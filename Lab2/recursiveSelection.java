package Lab2;

public class recursiveSelection {
    public static int minIndex(int list[], int i, int j)
    {
        if (i == j)
            return i;
      
        // Find minimum of remaining elements
        int k = minIndex(list, i + 1, j);
      
        // Return minimum of current and remaining.
        return (list[i] < list[k])? i : k;
    }
      
    // Recursive selection sort. n is size of a[] and index
    // is index of starting element.
    public static void recurSelectionSort(int list[], int length, int startingIndex)
    {
          
        // Return when starting and size are same
        if (startingIndex == length)
           return;
      
        // calling minimum index function for minimum index
        int k = minIndex(list, startingIndex, length-1);
      
        // Swapping when index nd minimum index are not same
        if (k != startingIndex){
           // swap
           int temp = list[k];
           list[k] = list[startingIndex];
           list[startingIndex] = temp;
        }
        // Recursively calling selection sort function
        recurSelectionSort(list, length, startingIndex + 1);
    }
    public static void main(String[] args) {
        
        int[] arr = new int[1000];
        for(int i = 0; i < 1000; i++){  //worst case
          //generate random numbers from -100 to 100
          arr[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
          // System.out.println(list[i]);
        }
        // Calling function
        recurSelectionSort(arr, arr.length, 0);
      
        //printing sorted array
        for (int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
