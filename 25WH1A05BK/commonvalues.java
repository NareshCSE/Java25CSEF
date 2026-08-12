package myproject5bk;
import java.util.Scanner;
public class commonvalues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter first string:");
		String str1=input.next();
		System.out.println("enter second string:");
		String str2=input.next();
		int l1=str1.length();
		int l2=str2.length();
		for(int i=0;i<l1;i++) {
			int f=0;
			for(int j=0;j<l2;j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					f=1;
				}
			}
			if(f==1) {
				System.out.println(str1.charAt(i)+" is common in string 2");
			}}}}


