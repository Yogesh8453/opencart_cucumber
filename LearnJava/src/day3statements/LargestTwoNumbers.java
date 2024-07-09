package day3statements;

import java.util.Scanner;

public class LargestTwoNumbers {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Number");
		a=sc.nextInt();
		System.out.println("Please Enter Second Number");
		b=sc.nextInt();
		if(a!=b) 
		{
		if(a>b)
		{
			System.out.println("First Number is Greater");
		}
		else {
			System.out.println("Second Number is Greater");
		}
		}
		else
		{
		System.out.println("Both Number are Equal");
		}

	}

}
