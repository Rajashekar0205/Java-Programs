package Practice;

import java.util.Scanner;

public class Arraysortdesc {

	static public void sortDesc(int arr[]) {
		int a=arr.length;
		int temp;
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		System.out.println("Descendig order");
		for(int i=0;i<a;i++){
		System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	static public void sortasc(int arr[]) {
		int a=arr.length;
		int temp;
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		System.out.println("ascending order");
		for(int i=0;i<a;i++){
		System.out.print(arr[i]+",");
		}
		System.out.println();
		
	}
	static public void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int len=scan.nextInt();
		int a[]=new int[len];
		System.out.print("enter array");
		for(int i=0;i<len;i++){
			a[i]=scan.nextInt();
			
			}
		sortDesc(a);
		sortasc(a);
	}
}
