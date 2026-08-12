package mypackage5z6;
import java.util.Scanner;
public class Stringarray {
    static String course[]= new String[5];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("enter course"+i);
			course[i]=scan.next();
		}
      System.out.println("enter a letter to match with");
      String matchedCourse[] =getCourse(scan.next());
      for (String coure : matchedCourse) {
    	  System.out.println(coure);
      }
	}
static String[] getCourse(String letter) {
	String matchedArray[]= new String[5];   
	for(int i=0;i<course.length;i++)
		if(course[i].startsWith(letter)) {
			matchedArray[i] = course[i];
		}
	return matchedArray;
}
}
