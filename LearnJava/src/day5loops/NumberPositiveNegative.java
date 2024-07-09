package day5loops;

import java.util.Scanner;

public class NumberPositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number");
		int a = sc.nextInt();
		if(a<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is Positive");
		}

	}

}
