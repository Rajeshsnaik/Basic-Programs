//swap to numbers
import java.util.*;
public class Swap_two_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() , b = sc.nextInt() , swap;
		
		System.out.println( " elements before swapping " + a + " " + b );
		swap = a;
		a = b;
		b = swap;
		System.out.println( " elements after  swapping " + a + " " + b );
	}
}
