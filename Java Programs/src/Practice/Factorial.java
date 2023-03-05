/**
 * 
 */
package Practice;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		
		double fact=1;
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial of "+ n +" is "+ fact);
	}

}
