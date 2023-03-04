/**
 * 
 */
package Practice;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class CountVowelConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");

String str1=scan.nextLine();
int vowelscount=0;
int a=0;
int e=0;
int i=0;
int o=0;
int u=0;

 for (int j = 0; j < str1.length(); j++) {
	 
	char c=str1.charAt(j);
			
	if (c =='a'||c =='e' ||c =='i'|| c =='o'||c =='u')
	{ vowelscount++;
	
	if (c =='a') {
		   a++;
	   }
	else if (c =='e'){
           e++;
	    }
	else if (c =='i'){
	       i++;
		}
	else if (c =='o'){
	       o++;
		}
	else if (c =='u'){
	       u++;
		}
	
	}
}

 System.out.println("Vowels count " + vowelscount);
 System.out.println("a count " + a);
 System.out.println("e count " + e);
 System.out.println("i count " + i);
 System.out.println("o count " + o);
 System.out.println("u count " + u);
 
	}

}
