/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        if(n%2!=0 && n%3!=0 && n!=0) {
        	System.out.println("its prime");
        }
        else {
        	System.out.println("not prime");
        }
	
	// other method
        
        boolean flag = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
	
	}
	
	

}
