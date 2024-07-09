package Yogesh;

public class SwapNumbersWithoutVariable {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Numbers before Swapping = " + a + ", " + b);
		a = a + b; // a = 30
		b = a - b; // b= 10
		a = a - b; // a=20
		System.out.println("Numbers after Swapping = " + a + ", " + b);

	}

}
