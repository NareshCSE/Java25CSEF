package myproject5bk;
import java.util.Scanner;
public class prifib {
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in) ;
     System.out.println("enter upto which range to check:");
     n=input.nextInt();
     int fa[]=getFibonnaci(n);
		for(int i=2;i<n;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c++;
				}
			}
				if(c<=1) {
					for(int k=0;k<n;k++) {
						if(fa[k]==i) {
							System.out.println(i);
						}
					}
				}
			}
		}
	static int[] getFibonnaci(int n) {
		int fibArray[]=new int[100];
		fibArray[0]=0;
		fibArray[1]=1;
		for(int i=2;i<=n;i++) {
			fibArray[i]=fibArray[i-1]+fibArray[i-2];
		}
		return fibArray;
	}
}

