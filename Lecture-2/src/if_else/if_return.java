package if_else;

import java.util.Scanner;

/*
 * return statement use as use END in flow chart
 * flow come on return statement the flow terminated and after that line
 * not execute
 */

public class if_return {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rem = n % 2 ;
		if(rem == 0) {
			System.out.println("Even");
			return;
		}
		System.out.println("Odd");
	}

}
