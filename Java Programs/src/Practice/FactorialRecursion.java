/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class FactorialRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println(multipy(num));
	}
	
	public static int multipy(int num) {
		if(num>=1) {
			return num=num*multipy(num-1);
		}
		else {
			return 1;
			}
		
		
	}

}
