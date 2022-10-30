package Practice;

public class Printpairs {

	static void pairs(int ar[],int n,int sum1) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((ar[i]+ar[j])==sum1) {
					System.out.println("the pair is"+ar[i]+" "+ar[j]);
				}
			}
		}
	}
	public static void main (String[] args){
		int a[]= {1,2,3,5,-1,6};
		int n=a.length;
		int sum=5;
		pairs(a,n,sum);
	}
}
