/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class RemoveWhiteSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String str = scan.nextLine();
		str=str.replaceAll("\\s","");
		System.out.println(str);
	}

}
