package mypackage;
import java.util.LinkedList;
public class LinkedlistDemo {
	public static void main(String[] args) {
		
		LinkedList<String> name=new LinkedList<>();
		name.add("divya");
		name.add("nikhitha");
		name.add("vaishu");
		name.addFirst("hasini");
		name.remove("nikhitha");
		for(String name1:name) {
		System.out.println(name1);
		}
	}
}
