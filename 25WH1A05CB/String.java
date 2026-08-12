package myproject5cb;

import java.util.Scanner;

public class StringArrayDemo {
	static String course[]=new String[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		for (int i=0;i<5;i++) {
			System.out.println("enter course"+i);
			course[i]=Scan.next();
		}
		System.out.println("enter a letter to match with");
		String matchedcourse[]=getCourse(Scan.next());
		for (String course : matchedcourse) {
		System.out.println(course);
		}

	}
	static String[] getCourse(String letter) {
		String matchedArray[]=new String[5];
		for (int i=0;i<course.length;i++) {
			if(course[i].startsWith(letter)) {
				matchedArray[i]=course[i];
				
			}
		}
		return matchedArray;
		
	}

}
