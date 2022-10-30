package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("enter first string");
      String x=scan.nextLine();
      System.out.println("enter second string");
      String y=scan.nextLine();
      
      x=x.replace(" ", "");
      y=y.replace(" ", "");
      
      x=x.toLowerCase();
      y=y.toLowerCase();
      
      char a[]=x.toCharArray();
      char b[]=y.toCharArray();
      
      System.out.println(x+" "+y);
      
      Arrays.sort(a);
      Arrays.sort(b);
      
      boolean flag=Arrays.equals(a, b);
      if(flag==true)
      {
    	  System.out.println("its anagram");
      }
      else
      {
    	  System.out.println("its not anagram");
      }
   
	}

}
