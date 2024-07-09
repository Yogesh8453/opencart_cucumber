package day8;

public class MethodsDemo {
	
	
	public void add (int a, int b)
	{
	int c = a+b;
	System.out.println("Addition is "+c);
	}
	public int sub(int a, int b)
	{
		int c =a-b;
		return c;
	}
	public void mul()
	{
		int a=10, b=2;
		System.out.println("Multiplication is "+(a*b));
	}
	public double div()
	{
		int a=10, b=2;
		double c =a/b;
		return c;
	}

	public static void main(String[] args) {
		
		MethodsDemo obj = new MethodsDemo();
		obj.add(20, 30);
		System.out.println("Substraction is "+obj.sub(30, 10));
		obj.mul();
		System.out.println("Division is "+obj.div());

	}

}
