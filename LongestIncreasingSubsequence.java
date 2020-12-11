package longestincreasingsubsequence;

import java.util.Random;

public class LongestIncreasingSubsequence { 
	   static int max_ref; 
	   
	   static int _lis(int arr[], int n) {
	       if (n == 1) 
	           return 1; 
	  
	       int res, max_ending_here = 1; 
	  
	        for (int i = 1; i < n; i++) {
	            res = _lis(arr, i); 
	            if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here) {
	                max_ending_here = res + 1;
	            }
	        } 
	  
	        if (max_ref < max_ending_here) {
	           max_ref = max_ending_here; 
	        }
	        return max_ending_here; 
	   } 
	  
	    static int lis(int arr[], int n) {
	         max_ref = 1; 
	        _lis( arr, n); 
	        return max_ref; 
	    } 
	  
	    public static void main(String args[]) {
	    	
	    	Random rand = new Random(); //instance of random class
	        int upperbound = 100;
	          //generate random values from 0-9
	        int arr[] = new int[25];
	        // when the array has many more elements it takes a very long time to run
	        for(int i = 0; i<24; i++) {
	        int int_random = rand.nextInt(upperbound);
	        arr[i] = int_random;
	        }
	        System.out.println("List: ");
	        for(int i : arr) {
	        	System.out.print(i + ",");
	        }
	        int n = arr.length; 
	        System.out.println("\nLength of longest increasing subsequence is " + lis(arr, n));
	    } 
	 } 