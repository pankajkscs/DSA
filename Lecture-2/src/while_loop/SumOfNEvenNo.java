package while_loop;

import java.util.Scanner;
/*
 * having some buggs
 * 
 */

public class SumOfNEvenNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		int i =1;
		while(i <=n) {
		if(i%2==0) {
			sum =sum+i;
			
		}
		i=i+1;
		}
		System.out.println(sum);
		
		
	
}
}