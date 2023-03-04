package Practice;

import java.util.Scanner;

public class CountEvenOddDigits {

	//count for number of even and old digits
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number");
	int n=scan.nextInt();
	int a=n;
	int evencount=0;
	int oldcount=0;
	while(a>0)
	{
		int rem = a%10;
		if(rem%2==0)
		{
		evencount++;
		}
		else
		{
		oldcount++;
		}
		a=a/10;
		
	}
	System.out.println("even number count is "+ evencount);
	System.out.println("old number count is "+ oldcount);
}
	}
