package learnsarray;

public class ObjectArrayType {

	public static void main(String[] args) {
		
		
		Object a[]=new Object[5];
		a[0]=10;
		a[1]=10.5;
		a[2]="Welcome";
		a[3]=true;
		a[4]='A';
		
		for(Object x:a)
		{
			System.out.println(x);
		}
	}

}
