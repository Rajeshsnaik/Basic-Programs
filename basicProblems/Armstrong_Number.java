//Armstrong of a number
import java.util.*;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be checked : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int original_no = n;
		
		while(n>0) {
			int last_digit = n % 10;
			sum += Math.pow(last_digit,3);
			n=n/10;
		}
		
		if(sum == original_no) 	
			System.out.println("Armstrong number");
		else 					
			System.out.println("Not Armstrong");
	}
}
