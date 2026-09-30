package mypackage5ad;

import java.util.Scanner;

 public class StringArrayDemo {
	 static String course[]=new String[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
        	System.out.println("Enter Course:"+i);
        	course[i]=scan.next();
        }
        System.out.println("Enter a letter to match with");
        String matchedCourse[]=getCourse(scan.next());
        for(String course:matchedCourse)
        {
        	System.out.println(course);
        }
        
	}
	static String[] getCourse(String letter)
	{
		String matchedArray[]=new String[5];
		for(int i=0;i<course.length;i++)
		{
			if(course[i].startsWith(letter)) {
				matchedArray[i]=course[i];
			}
		}
		return matchedArray;
	}
	
}

