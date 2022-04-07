package Lab5_sorting_algorithms;

public class divide_and_conquer {
    
    public static void main(String[] args) {
        int[] test = {12,5,3,2,3,53,4,34,32,23,44,53,232};
        System.out.println(maxDAC(test, 0, test.length-1));
    }
    static int max, maxUpper, maxLower;     //global variables to max max upper and max lower
    public static int maxDAC(int[] array, int lower, int upper){        //takes in lowest index and upper index
        int mid;
        //for 1 element
        if(lower == upper){     //if there is 1 element return its value
            max = array[lower];
            return max;
        }
        //for 2 elements     
        if(upper == lower + 1){     //if there are 2 elements compare them
            if(array[lower] > array[upper]){
                max = array[lower];
            }
            else{
                max = array[upper];
            }
            return max;
        }
        mid = (lower + upper) / 2;      //if there are more than 2 split the array in halph and recursivly feed them back into itself until you compare 2 numbers
        maxLower = maxDAC(array, lower, mid);//the max lowe will be the max of the second 1/2 of array
        maxUpper = maxDAC(array, mid + 1, upper);       //the max upper will be the max of the second 1/2 of array
        if(maxLower > maxUpper){//then compare the max of the upper and lower halves and return max
            max = maxLower;
        }
        else max = maxUpper;
        return max;
        
    }
}
