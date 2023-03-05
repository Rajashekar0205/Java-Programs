/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year1=scan.nextInt();
		
		if((year1%400==0 || year1%100 !=0 && year1%4==0))
		{
			System.out.println("year is Leap year");
		}
		else {
			System.out.println("year is not Leap year");
		}
		
	}

}
