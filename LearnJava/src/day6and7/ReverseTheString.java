package day6and7;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any String");
		String s = sc.nextLine();
		String rev = " ";
		for(int i=0; i<s.length(); i++)
		{
			rev=s.charAt(i)+rev;
			
		}
		
		System.out.println(rev);
		sc.close();
		
	}

}
