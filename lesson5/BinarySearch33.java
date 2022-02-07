package com.lesson5;
import java.util.Scanner;
public class BinarySearch33 
{
	 public static  void main(String[] args){
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter a number");
	        int[] arr = {3,9,23,45,56,59,67,78,81,90,93,95};
	        int key =s.nextInt();
	        int arrlength = (arr.length-1); 
	        binarySearch(arr,0,key,arrlength);
	    }

	 	public static void binarySearch(int[] arr, int start, int key, int length){

	        int midValue = (start+length)/2;       
	        while(start<=length){

	            if(arr[midValue]<key){
	                start = midValue + 1;
	            } else if(arr[midValue]==key){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }      
	 	}
	}
