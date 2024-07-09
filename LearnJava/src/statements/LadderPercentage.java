package statements;

import java.util.Scanner;

public class LadderPercentage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Percentage");
		int a=sc.nextInt();
		if(a<=100 && a>=95)
		{
			System.out.println("Congrats!!..You have Got O Grade");

		}
		else if(a<=94 && a>=80)
		{
			System.out.println("Congrats!!..You have Got A Grade");
		}
		else if(a<=79 && a>=70)
		{
			System.out.println("Congrats!!..You have Got B Grade");
		}
		else if(a<=69 && a>=60)
		{
			System.out.println("Congrats!!..You have Got C Grade");
		}
		else if(a<=59 && a>=50)
		{
			System.out.println("Congrats!!..You have Got D Grade");
		}
		else if(a<50)
		{
			System.out.println("You are Fail");
		}
		else
		{
			System.out.println("Please Enter Corrent Input");
		}
	}

}
