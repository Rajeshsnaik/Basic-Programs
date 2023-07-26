import java.util.*;
//Fibonacci series
public class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=1;
		
		System.out.println("a = " + a + " ");
		System.out.println("b = " + b + " ");
		System.out.println("Fibonacci Series:");
		
		for(int i=0;i<n;i++) {
			int c = a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
		
	}

}
