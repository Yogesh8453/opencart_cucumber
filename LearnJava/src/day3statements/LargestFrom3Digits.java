package day3statements;

import java.util.Scanner;

public class LargestFrom3Digits {

	public static void main(String[] args) {
		
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Number");
		a=sc.nextDouble();
		System.out.println("Please Enter Second Number");
		b=sc.nextDouble();
		System.out.println("Please Enter Third Number");
		c=sc.nextDouble();
		if(a>b && a>c)
		{
			System.out.println("First Number is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second Number is Greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("Third Number is Greater");
		}
		else {
			System.out.println("Please Enter Three Different Numbers");
		}

	}

}
