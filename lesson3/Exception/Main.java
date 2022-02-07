package com.Exception;
public class Main
{
	public static void main(String[] args) {
		
		KthSmallst ob = new KthSmallst(); 
		
        int arr[] = {12, 3, 57, 4, 19, 26}; 
        
        int right=0;//first index
        
        int n = arr.length;
        
        int left= n-1; //last index
        int k = 4; 
        
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, right,left, k)); 
    }
}