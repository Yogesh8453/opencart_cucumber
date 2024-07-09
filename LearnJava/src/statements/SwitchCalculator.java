package statements;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==========Calculator==========");
		System.out.println("Press\n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
		{
			System.out.println("Please Enter 1st Number");
			int x=sc.nextInt();
			System.out.println("Please Enter 2nd Number");
			int y=sc.nextInt();
			System.out.println("Addition of two Numbers "+(x+y));
			break;
		}
		case 2:
		{
			System.out.println("Please Enter 1st Number");
			int x=sc.nextInt();
			System.out.println("Please Enter 2nd Number");
			int y=sc.nextInt();
			System.out.println("Substraction of two Numbers "+(x-y));
			break;
		}
		case 3:
		{
			System.out.println("Please Enter 1st Number");
			int x=sc.nextInt();
			System.out.println("Please Enter 2nd Number");
			int y=sc.nextInt();
			System.out.println("Multiplication of two Numbers "+(x*y));
			break;
		}
		case 4:
		{
			System.out.println("Please Enter 1st Number");
			int x=sc.nextInt();
			System.out.println("Please Enter 2nd Number");
			int y=sc.nextInt();
			System.out.println("Division of two Numbers "+(x/y));
			break;
		}
		default:
		{
			System.out.println("Please Enter Valid Input");
		}
			
		}
		sc.close();
	}
	

}
