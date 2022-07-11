package if_else;

import java.util.Scanner;
/*in this progran i am using if else if and if condition is match 
 * then working fine but when conditin is not match then also print
 * somthin but i want not print any thing if input is worng so that we
 * are use only else if.
 * 
 * 
 */
public class IntToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		if(n == 1) {
//			System.out.println("One");
//			
//		}else if(n == 2) {
//			System.out.println("Two");
//			
//		}else if(n == 3) {
//			System.out.println("Three");
////		}else {
////			System.out.println("Invalid input");
//		}else if(n == 4) {
//			System.out.println("Four");
//		}
//		
		if( n == 1) {
			System.out.println("one");
			
		}
		if(n == 2) {
			System.out.println("Two");
		}
		if(n == 3) {
			System.out.println("Three");
		}
	}

}
