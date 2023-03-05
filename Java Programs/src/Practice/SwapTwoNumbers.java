/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class SwapTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=scan.nextInt();
        System.out.println("enter the second number");
        int b=scan.nextInt();
        int c;
        System.out.println("a is "+a+ " "+"b is "+b );
        {
        	c=a;
        	a=b;
        	b=c;
        }
        System.out.println("a is "+a+ " "+"b is "+b );
        
        // other way 
		/*
		 * System.out.println("a is "+a+ " "+"b is "+b );
		 *  {
		 *   a=a+b;
		 *   b=a-b; 
		 *   a=a-b; 
		 *   }
		 * System.out.println("a is "+a+ " "+"b is "+b );
		 */
	}

}
