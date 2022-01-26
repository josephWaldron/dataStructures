package Lab2;

public class linearSearch {
    /** The method for finding a key in the list */
    public static int linearSearch1(int[] list, int key) {
      for (int i = 0; i < list.length; i++) {
        if (key == list[i])
          return i;
      }
      return -1;
    }
  
    public static void main(String[] args) {
      int[] list = {4, 5, 1, 2, 9, -3};
      System.out.println(linearSearch1(list, 2));
    }
  }
