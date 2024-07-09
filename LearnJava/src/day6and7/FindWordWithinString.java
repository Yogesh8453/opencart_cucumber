package day6and7;

import java.util.Scanner;

public class FindWordWithinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Phrase");
		String s = sc.nextLine();
		System.out.println("Enter Word to find in Phrase");
		String f = sc.next();
		if(s.contains(f))
		{
		System.out.println(f+ " Found");	
		}
		else
		{
			System.out.println("Not Found");
		}
		sc.close();
	}

}
