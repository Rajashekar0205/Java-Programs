/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class PositiveOrNegative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the number");
           double n=scan.nextDouble();
           if(n>0) {
        	   System.out.println("positive");
           }
           else if(n<0)
           {
        	   System.out.println("negative");
           }
           else{
        	   System.out.println("Zero");
           }

	}

}
