package if_else;

import java.util.Scanner;

public class AlphabetPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		char ch = s.charAt(0);

		if(ch>='a' && ch<='z') {
			System.out.println(0);
		}else if(ch>='A' && ch<='Z') {
			System.out.println(1);
		}else if(ch=='#') {
			System.out.println(-1);
		}

	}

}

