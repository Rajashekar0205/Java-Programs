/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class AvgAndSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan  = new Scanner(System.in);
      System.out.println("enter the first number");
      int a= scan.nextInt();
      System.out.println("enter the second number");
      int b= scan.nextInt();
      
      int sum1= (a+b);
      int avg1 = (sum1)/2;
      System.out.println("Sum of entered 2 numbers is " + sum1);
      System.out.println("Avg of entered 2 numbers is " + avg1);
	}

}
