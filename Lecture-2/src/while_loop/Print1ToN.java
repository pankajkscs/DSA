package while_loop;

import java.util.Scanner;
/*Here is requirement is i input 10 and print 1 to 10 number.
 * 
 * 
 */

public class Print1ToN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) {
			System.out.println(i);
			i=i+1; //if i remove this line then loop runninfg infinite
			
		}
	
	}

}
