package learnsarray;

/* 1.Declare Array
 * 2.insert values in array
 * 3.find size of an array
 * 4.read single value from array
 * 5.read multi values from array
 */

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		int b[]= {100,200,300,400};
		
		System.out.println(b.length);
		
		for(int i = 0;  i < a.length; i++)
				{
			System.out.print(a[i] + ", ");
				}
		System.out.println();
		for(int x:b)
		{
			System.out.print(x +", ");
		}
	}

}
