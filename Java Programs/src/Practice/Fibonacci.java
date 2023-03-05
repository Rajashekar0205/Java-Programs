/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int f1,f2=0,f3=1;
		System.out.print(f2+" "+f3);
		for (int i = 3; i <=num; i++) {
			f1=f2;
			f2=f3;
			f3=f1+f2;
			System.out.print(" "+f3);
			
		}
	}

}
