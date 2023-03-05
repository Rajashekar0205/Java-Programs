/**
 * 
 */
package Practice;

/**
 * @author Raja shekar
 *
 */
public class IntegerCachingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Compare two int numbers (Integer Caching)
         // here system compares reference of numbers, 
        //-128 to 127 is the range for integer caching
        Integer num1 = 128;
        Integer num2 = 128;

        if (num1 == num2) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    
	}

}
