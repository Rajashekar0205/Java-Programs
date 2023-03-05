/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class PowerOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        System.out.println("enter exponential");
        int exp=scan.nextInt();
        long result=1;
        while(exp!=0) {
        	result=result*n;
        	exp--;
        }
        System.out.println(result);
	}

}
