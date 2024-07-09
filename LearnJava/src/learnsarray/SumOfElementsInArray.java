package learnsarray;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {5,10,7,8};
		int sum=0;
		
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
