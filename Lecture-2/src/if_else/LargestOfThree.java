package if_else;

import java.util.Scanner;
/*if check condition between condition two no or three no then use 
 * AND or OR operate and also use if else or else_if
 * 
 * 
 * 
 */

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		
//		if(a >= b && a >= c) {
//			System.out.println("largest number " +a);
//		}else
//			if(b >= a && b >= c) {
//				System.out.println("largest number "+b);
//				
//			}else {
//				System.out.println("Largest number " +c);
//			}
		
		/* use else_if and check condation ie either condation one
		is true or either condation 2nd is true and show on.
		here i am using if else if and else , i can use many more else if
		
		*/
		
		if(a >= b && a >= c) {
			System.out.println("A ia larger no");
		}else if(b >= a && b >= c){
			System.out.println("B is larger no");
			
		}else {
			System.out.println("C is larger no");
		}
		
		
		
		
	}
	
	      
           
}
