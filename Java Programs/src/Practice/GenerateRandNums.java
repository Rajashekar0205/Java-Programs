/**
 * 
 */
package Practice;

import java.util.Random;

/**
 * @author Raja shekar
 *
 */
public class GenerateRandNums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Random rand=new Random();
       //first method
         int int_rand=rand.nextInt(1000);
         System.out.println(int_rand);
       //second method
         double D_rand=rand.nextDouble();
         System.out.println(D_rand);
       //Third method
         System.out.println(Math.random());

	}

}
