package day6and7;

import java.util.Arrays;
import java.util.Collections;

public class SortTheArray {

	public static void main(String[] args) {
		
		int arr[]= {2,4,3,1,5};	
		System.out.println("Array Before Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Ascending Sorting");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Descending Sorting");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
