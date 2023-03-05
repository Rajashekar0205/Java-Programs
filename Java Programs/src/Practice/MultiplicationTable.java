/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner scan=new Scanner(System.in);
              System.out.println("enter number to get table");
              int n=scan.nextInt();
              
              for (int i = 1; i <= 10; i++) {
				System.out.println(n+" * "+i+" = "+(i*n));
			}

	}

}
