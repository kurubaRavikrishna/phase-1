package com.lesson2;
public class Arrays9 
{
	public static void main(String[] args) 
    {
		//one dimension array
		int a[]= {7,5,32,5,41};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		//Two dimensional array
        int[][] arr = { { 1, 2 }, { 3, 4 } }; 
  
        for (int i = 0; i < 2; i++) 
        {               
            for (int j = 0; j < 2; j++) 
            {           
                System.out.print(arr[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 

}
