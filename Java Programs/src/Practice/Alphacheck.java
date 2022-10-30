package Practice;

import java.util.Scanner;

public class Alphacheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the character");
		char c=scan.next().charAt(0);
		if((c>='a')&&(c<='z')||(c>='A')&&(c<='Z')) {
			System.out.println("its a alphabit");
		}
		else
		{
			System.out.println("its not a alphabit");
			}
	}

}
