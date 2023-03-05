/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class OddOrEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("enter number ");
        int num=scan.nextInt();
        if(num%2==0) {
        	System.out.println("even");
        }
        else {
        	System.out.println("old");
        }
	}

}
