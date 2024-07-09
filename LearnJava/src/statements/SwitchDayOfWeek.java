package statements;

import java.util.Scanner;

public class SwitchDayOfWeek {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Day of Thhe week Mon, Tue, Wed.....etc");
		String day = sc.next();
		switch(day)
		{
		case "mon":
		{
			System.out.println("Its Monday");
			break;
		}
		case "tue":
		{
			System.out.println("Its Tuesday");
			break;
		}
		case "wed":
		{
			System.out.println("Its Wednsday");
			break;
		}
		case "thu":
		{
			System.out.println("Its Thursday");
			break;
		}
		case "fri":
		{
			System.out.println("Its Friday");
			break;
		}
		case "sat":
		{
			System.out.println("Its Saturday");
			break;
		}
		case "sun":
		{
			System.out.println("Its Sunday");
			break;
		}
		default:
		{
			System.out.println("Please Enter Valid Input");
		}
		}

	}

}
