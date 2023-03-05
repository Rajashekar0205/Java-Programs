/**
 * 
 */
package Practice;

/**
 * @author Raja shekar
 *
 */
public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    pattern1(5);
	        System.out.println("======================");
	        pattern2(5);
	        System.out.println("======================");
	        pattern3(5);
	        System.out.println("======================");
	        pattern4(5);
	        System.out.println("======================");
	        pattern5(5);
	        System.out.println("======================");
	       


	    }

	    static void pattern1(int n) {
	        for (int row = 1; row <= n; row++) {
	            //for every row run the col
	            {
	                for (int col = 1; col <= row; col++)
	                    System.out.print("* ");

	            }
	            //when one row is printed,we need to add a new line
	            System.out.println();

	        }

	    }


	    static void pattern2(int n) {
	        for (int row = 1; row <= n; row++) {
	            {
	                for (int col = 1; col <= n; col++)
	                    System.out.print("* ");

	            }
	            System.out.println();

	        }
	    }

	    static void pattern3(int n) {
	        for (int row = 1; row <= n; row++) {
	            {
	                for (int col = 1; col <= n - row + 1; col++)
	                    System.out.print("* ");

	            }
	            System.out.println();

	        }
	    }

	    static void pattern4(int n) {
	        for (int row = 1; row <= n; row++) {
	            {
	                for (int col = 1; col <= row; col++)
	                    System.out.print(col + " ");

	            }
	            System.out.println();

	        }
	    }

	    static void pattern5(int n) {
	        for (int row = 0; row < 2 * n; row++) {
	            int totalColsInRows = row > n ? 2 * n - row : row;
	            for (int col = 0; col < totalColsInRows; col++) {
	                System.out.print("* ");
	            }
	            System.out.println();

	}
	    }
}
