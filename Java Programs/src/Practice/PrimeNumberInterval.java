/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class PrimeNumberInterval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter lower limit");
		int lowerlimit = scan.nextInt();
		System.out.println("enter upper limit");
		int upperlimit = scan.nextInt();

		for (int i = lowerlimit; i <= upperlimit; i++) {
			if (isPrime(i)) {
				System.out.print(" " + i);
			}
		}
	}

	static boolean isPrime(int n) {

		// 0, 1 negative numbers are not prime
		if (n < 2)
			return false;

		// checking the number of divisors b/w 1 and the number n
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}

		// if reached here then must be true
		return true;
	}

}
