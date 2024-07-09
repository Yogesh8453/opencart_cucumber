package day5loops;

import java.util.Scanner;

public class WhileUserEnters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Please Enter Number");
		while((a=sc.nextInt())!=0)
		{
			System.out.println("You have Entered "+a);
			System.out.println("Please Enter Next Number");
		}
		System.out.println("Out of Loop");

	}

}
