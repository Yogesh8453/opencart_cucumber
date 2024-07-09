package learnsarray;

public class CountEvenOddFromArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6,7};
		int ecounter=0;
		int ocounter=0;
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				ecounter++;
			}
			else
			{
				ocounter++;
			}
		}
		System.out.println(ecounter);
		System.out.println(ocounter);
		
		
	}

}
