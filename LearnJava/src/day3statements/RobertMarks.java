package day3statements;

import java.util.Scanner;

public class RobertMarks {

	public static void main(String[] args) {
		
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Marks of First Subject out of 100");
		a=sc.nextDouble();
		System.out.println("Please Enter the Marks of Second Subject out of 100");
		b=sc.nextDouble();
		System.out.println("Please Enter the Marks of Third Subject out of 100");
		c=sc.nextDouble();
		double TotalMarks = a+b+c;
		System.out.println("Total Marks of Robert is = "+TotalMarks);
		double p = TotalMarks/300*100;
		System.out.println("Robert's Percentage = "+ p);
		

	}

}
