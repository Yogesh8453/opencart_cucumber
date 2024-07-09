package day5loops;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number to find Factorial");
		int a = sc.nextInt();
		for(int i=a; i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is "+fact);
		sc.close();
	}

}
