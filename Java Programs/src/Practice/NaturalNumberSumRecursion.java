/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class NaturalNumberSumRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("enter number ");
        int num=scan.nextInt();
        int sum=addnum(num);
        System.out.println(sum);
	}
	public static int  addnum(int num) {
		if(num!=0) {
			return num+addnum(num-1);
		}
		else {
			return num;
		}
		
	}

}
