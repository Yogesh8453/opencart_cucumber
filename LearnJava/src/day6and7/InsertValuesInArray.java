package day6and7;

import java.util.Scanner;

public class InsertValuesInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Please Enter Length of an Array");
		int length = sc.nextInt();
		System.out.println("Please Enter Values in Array");
		for(int i=0; i<length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in Array are");
		for(int i=0;i<length;i++)
		{
		System.out.println(+a[i]);
		}
		sc.close();
	}

}
