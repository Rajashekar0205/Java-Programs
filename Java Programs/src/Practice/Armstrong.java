package Practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//An Armstrong number is a number whose sum of the cubes of its digits equals the number itself
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		double result=0;
				int a=n;
		while(a!=0) {
			int p=a%10;
			result=result+ Math.pow(p ,3);
			a=a/10;
		}
		if(result==n) {
			System.out.println(" the amstrong number");
			}
		else{
			System.out.println(" not amstrog");
			}
	}

}
