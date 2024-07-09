package learnsarray;

public class MultiDimArray {

	public static void main(String[] args) {
		
		
		int a[][]= {{100,200},
				{300,400},
				{500,600}};
		
		for(int r=0; r<a.length; r++)
		{
			for(int c=0; c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
				
			}
			System.out.println();
		}
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}

	}

}
