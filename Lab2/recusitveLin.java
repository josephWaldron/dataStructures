package Lab2;


public class recusitveLin {
    public static void main(String[] args) {
        int N = 100000;
        int KEY = 200;
        int[] list = new int[N];
    for(int i = 0; i < N; i++){  //worst case
      //generate random numbers from -100 to 100
      list[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
      // System.out.println(list[i]);
    }
    long begin, end, time;
    begin = System.nanoTime();
    //Start timer
    System.out.println(recursiveLinearSearch(list, KEY, 0));
    end = System.nanoTime();
    time = end - begin;
    System.out.println("It took " + time + " nanoseconds to run linear search with the key " + KEY + " on an array with " + N + " elements.");
    }
    public static int recursiveLinearSearch(int list[], int key, int index){
        if(list[index] == key){
            return index;
        }
        else if(index + 1 < list.length)return recursiveLinearSearch(list, key, index + 1);
        else return -1;
    }
}

