package z5;

import java.util.Scanner;

public class OddEven {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integers=new int[10];
		int[] even=new int[10];
	int[] odd=new int[10];
	int evencount=0;
	int oddcount=0;
	int eve=0;
	int od=0;
    
     for(int i=0;i<10;i++) {
  	   System.out.println("enter number "+i);
  	   integers[i]=scan.nextInt();
  	   
     }
     for(int i=0;i<10;i++) {
    	 if(integers[i]%2==0) {
    		  even[evencount]+=integers[i];
    		 evencount++;
    	 }
    	 if(integers[i]%2!=0) {
   		  odd[oddcount]+=integers[i];
   		 oddcount++;
   	 }
     }
     for(int i=0;i<evencount;i++) {
    	 eve +=even[i];
     }
     for(int i=0;i<evencount;i++) {
    	 od +=odd[i];
     }
     System.out.println(eve);
     System.out.println(od);
	}

}
