package if_else;

/*when i try to condition with else(a>0) then we get compiletime error
 * only one else block can be use 
 * 
 * 
 * 
 */
public class CondationCheck {
	public static void main(String[] args) {
		int a =50;
		int b = Integer.MIN_VALUE;
		
		
	
		System.out.println(b);
		if(a>10) {
			System.out.println("Coding");
		} else{
	    System.out.println("Ninjas");
		}
		
		
	}

}
