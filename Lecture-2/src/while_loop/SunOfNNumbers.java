package while_loop;

import java.util.Scanner;

public class SunOfNNumbers {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
//		int i = (n*(n+1))/2;
//		System.out.println(i);
		
		int i = 1;//next no to be added
		int sum = 0;
		while(i <= n) {
			sum = sum +i;
			i = i+1;//no of times loop is run
		
		}
		System.out.println(sum);
	}

}
