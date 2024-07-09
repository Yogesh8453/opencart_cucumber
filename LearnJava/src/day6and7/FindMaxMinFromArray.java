package day6and7;

public class FindMaxMinFromArray {

	public static void main(String[] args) {
		
		int arr[] = {21,234,300,4,500};
		int min=0, max=0;
		min=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value in Array "+max);
		System.out.println("Minimum value in Array "+min);
	}

}
