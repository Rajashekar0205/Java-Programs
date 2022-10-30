package Practice;

import java.util.Scanner;

public class Countnumandalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("eter the string");
		String str=scan.nextLine();
		
		int lowercase=0;
		int uppercase=0;
		int digits=0;
		int other=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			char a=str.charAt(i);
			if(Character.isUpperCase(a))
					{
				uppercase++;
					}
			else if(Character.isLowerCase(a))
			{
		lowercase++;
			}
			else if(Character.isDigit(a))
			{
		digits++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("Total length"+str.length());
		System.out.println("Uppercase "+uppercase);
		System.out.println("Lowercase "+lowercase);
		System.out.println("Digits "+digits);
		System.out.println("Other "+other);

	}

}
