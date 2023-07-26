// Print all digits of positive decimal number from right to left.

import java.util.Scanner;

public class Print_all_digits_of_positive_decimal_number_from_right_to_left {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n > 0) {
			int rem = n % 10;
			System.out.print(rem);
			n = n/10;
		}
		
	}

}
