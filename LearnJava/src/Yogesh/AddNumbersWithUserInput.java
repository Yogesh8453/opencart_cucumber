package Yogesh;

import java.util.Scanner;

public class AddNumbersWithUserInput {

	public static void main(String[] args) {
		
		System.out.println("Please Enter Two Numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =a+b;
		System.out.println("Addition of two numbers = "+ c);

	}

}
