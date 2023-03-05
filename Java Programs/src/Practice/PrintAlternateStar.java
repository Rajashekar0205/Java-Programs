/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class PrintAlternateStar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String str=scan.nextLine();
        for (int i = 0; i <str.length(); i++) {
			if(i%2==0) {
				System.out.print(str.charAt(i));
			}
			else {
				System.out.print("*");
			}
		}
	}

}
