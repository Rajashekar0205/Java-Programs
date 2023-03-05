/**
 * 
 */
package Practice;

import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("enter number ");
		int num = scan.nextInt();

		int rev = 0;
		int org = num;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (rev == org) {
			System.out.println("number is polindrome");
		} else {
			System.out.println("number is not polindrome");
		}
		 
        
        // StringBuffer fro string polidrome
		scan.nextLine(); // to clear the scan int in memory to accept scanline.
        System.out.println("enter string ");
        String str=scan.nextLine();
        StringBuffer sb= new StringBuffer(String.valueOf(str)) ;
        StringBuffer rev1= sb.reverse();
        String revstr= sb.toString();
        System.out.println(rev);
        System.out.println(rev1);
        
      		if (revstr.equals(str)) {
			System.out.println("String is polindrome");
		} else {
			System.out.println("String is not polindrome");
		}
		 
        
        // StringBuilder
		/*
		 * StringBuilder sb1=new StringBuilder(); sb1.append(org); StringBuilder
		 * rev2=sb1.reverse();
		 */
       
	
        
	}

}
