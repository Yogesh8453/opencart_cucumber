package statements;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Three Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greatest");
		}
		if(b>a && b>c)
		{
			System.out.println("B is greatest");
		}
		if(c>b && c>a)
		{
			System.out.println("C is greatest");
		}
		else
		{
			System.out.println("Please Enter Three Unique Numbers");	
		}

	}

}
