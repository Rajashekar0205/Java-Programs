/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class CountNumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the number");
           int a=scan.nextInt();
           int count=0;
         while(a>0) {
        	 a=a/10;
        	 count++;
         }
         System.out.println("count of digits"+ count);

	}

}
