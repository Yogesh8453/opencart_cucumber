package day3statements;

import java.util.Scanner;

public class AllAreEqual {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Number");
		a=sc.nextDouble();
		System.out.println("Please Enter Second Number");
		b=sc.nextDouble();
		System.out.println("Please Enter Third Number");
		c=sc.nextDouble();
		if(a==b && b==c)
		{
			System.out.println("All Numbers are Equal");
		}
		else if(a==b && a!=c)
		{
			System.out.println("First two Numbers are equal");
		}
		else if(a==c && a!=b)
		{
			System.out.println("First and Third Numbers are Equal");
		}
		else if(b==c && b!=a)
		{
			System.out.println("Second and Third Numbers are Equal");
		}
		else {
			System.out.println("All Numbers are Different");
		}

	}

}
