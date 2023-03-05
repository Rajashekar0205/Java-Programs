/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class NaturalNumberSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum= 1+2+3+4....+n.
		Scanner scan=new Scanner(System.in);
        System.out.println("enter number ");
        int n=scan.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
			sum=sum+i;
		}
        System.out.println("sum is "+sum);
	/// other way
        System.out.println("sum is "+ ((n*(n+1))/2));
	
	
	}
	
	
	

}
