/**
 * 
 */
package Practice;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class DistinctVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 String str=scan.nextLine();
		
	        str = str.toLowerCase();
	        HashSet<Character> set = new HashSet<>(); // Here you store used vowels
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
	                    || str.charAt(i) == 'u') { // if currently checked character is vowel...
	                set.add(str.charAt(i)); // add this vowel to setOfUsedChars

	            }

	        }
	        System.out.println(set.size());
	        
	}

}
