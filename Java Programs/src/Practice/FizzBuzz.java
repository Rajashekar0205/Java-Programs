/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the fizz number");
		int num=scan.nextInt();
		int a=50;
		
		for (int i = 1; i <= a; i++) {
			if(i%num==0) {
				System.out.println("FizzBuZZ");
			}
			else {
				System.out.println(" "+i);
			}
		}
	}

}
