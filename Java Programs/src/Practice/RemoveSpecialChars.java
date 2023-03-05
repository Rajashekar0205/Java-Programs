/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class RemoveSpecialChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// removes special characters in string
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String str = scan.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

	}

}
