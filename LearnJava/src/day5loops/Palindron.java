package day5loops;

import java.util.Scanner;

public class Palindron {

	public static void main(String[] args) {
		
		int num, sum=0, rev;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number");
		num=sc.nextInt();
		int p=num;
		
		while(num!=0)
		{
			rev=num%10;
			sum=(sum*10)+rev;
			num=num/10;
			
		}
		System.out.println("Reverse Number is "+sum);
		
		if(sum==p)
		{
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Plaindrome");
		}
	}

}
