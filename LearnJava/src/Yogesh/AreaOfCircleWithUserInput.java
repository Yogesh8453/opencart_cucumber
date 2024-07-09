package Yogesh;

import java.util.Scanner;

public class AreaOfCircleWithUserInput {

	public static void main(String[] args) {
		
		System.out.println("Please Enter Radius of Circle");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double area = 3.14*r*r;
		System.out.println("Area of Circle is = "+ area);
		

	}

}
