package mypackage5ad;
import java.util.HashMap;
import java.util.Scanner;
public class HashMatch {

	public static void main(String[] args) {
		HashMap<String,String> Match=new HashMap<String,String>();
		Scanner input=new Scanner(System.in);
		Match.put("Pavani", "7123456789");
		Match.put("Supriya", "9123456789");
		Match.put("Harshitha", "8123456789");
		String val1=input.next();
		boolean found;
			if(Match.containsKey(val1))
			{
				System.out.println("key:"+val1+" value:"+Match.get(val1));
				found=true;		
			}
			else
			{
				found=false;
				for (String i : Match.keySet()) 
				{
					if(Match.get(i).equals(val1))
					{
					  System.out.println("key: " + i + " value: " + Match.get(i));
					  found=true;
					  break;
					}
			     }
	       }
			if(found==false)
			{
				System.out.println("no match");
			}
	}
}
