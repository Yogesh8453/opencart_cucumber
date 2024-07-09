package Yogesh;

import java.util.Scanner;

public class CheckAudltOrMinor {

	public static void main(String[] args) {
		
		System.out.println("Please Enter your Age");
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		if(Age < 18)
		{
			System.out.println("Your are Minor");	
		}
		else
		{
			System.out.println("Your are an Adult");
		}
		

	}

}
