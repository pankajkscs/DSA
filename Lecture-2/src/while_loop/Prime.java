package while_loop;

import java.util.Scanner;
/*check given no is prime or not
 * prime no-no which is divisiable by 1 and itself
 *not prime-those no which in divisiable by 2 and (n-1) 
 * in this situation we have to check one by one no
 * and the given no divigable by 2 to (n-1) that no not prime
 * if i check only for 2 divigable the we get worng answer
 * eg 143 is not divisable by 2 but it is also not prime no
 * so that check every no sivisable by 2 to (n-1) or or not.
 * 
 */

public class Prime {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int d = 2;
		while(d <= n-1) {
			if(n % d ==0) {
				System.out.println("Not prime");
				return;
			}
		
			d = d +1;
		}
		System.out.println("prime ");
		
		
	}

}
