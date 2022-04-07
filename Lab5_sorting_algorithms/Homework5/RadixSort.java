package Lab5_sorting_algorithms.Homework5;

import java.util.*;

public class RadixSort {
	public static void main(String[] args)
	{
		int[] list = new int[100000];
        for (int i = 0; i < list.length; i++) {     //create list of elements
            list[i] = (int)(Math.random() * 10000);
        }
		int n = list.length;
		long begin, end, time;
        System.out.println("sorting");
        begin = System.nanoTime();
        radixsort(list, n);
        end = System.nanoTime();
        time = end - begin;
        System.out.println("Time for sort " + time);
	}
    
	static int getMax(int arr[], int n) //find max value in array
	{
		int max = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	// A function to do counting sort of arr[]
	static void countSort(int arr[], int n, int exp)
	{
		int output[] = new int[n]; // output array
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		// Store count of occurrences in count[]
		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;

		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build the output array
		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		// Copy the output array to arr[], so that arr[] now
		// contains sorted numbers according to current digit
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}

	// The main function to that sorts arr[] of size n using
	// Radix Sort
	static void radixsort(int arr[], int n)
	{
		// Find the maximum number to know number of digits
		int m = getMax(arr, n);

		// Do counting sort for every digit. 
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}
}
