package Practice;

import java.util.Scanner;

public class Democalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		float a=scan.nextFloat();
		System.out.println("enter second number");
		float b=scan.nextFloat();
		
		System.out.println("enter +,-,/,*");
		char operator=scan.next().charAt(0);
		
		double result=0;
	
		switch(operator) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '/':
			result=a/b;
			break;
		case '*':
			result=a*b;
			break;
		}
		System.out.println("the result is "+result);
	
	
	
		
	}

}
