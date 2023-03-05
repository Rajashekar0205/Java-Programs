/**
 * 
 */
package Practice;

import java.util.Arrays;

/**
 * @author Raja shekar
 *
 */
public class MissingCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[] c = {'a', 'b', 'c'};
	        c = new String(c).replace("b", "").toCharArray();
	        System.out.println("b is missing" + " " + Arrays.toString(c));
	    
	}

}
