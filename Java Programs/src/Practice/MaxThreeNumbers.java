/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class MaxThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println("Enter c");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is a big number");
        }
        if (b > a && b > c) {
            System.out.println("b is a big number");
        }
        if (c > b && c > a) {
            System.out.println("c  is a big number");
        }
	}

}
