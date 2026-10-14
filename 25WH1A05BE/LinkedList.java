package mypackage5be;

import java.util.LinkedList;
public class LinkedlistDemo {
	public static void main(String[] args) {
		
		LinkedList<String> name=new LinkedList<>();
		name.add("Nikhitha");
		name.add("Divya");
		name.add("Jyothi");
		name.addFirst("Bhavagna");
		name.remove("Nikhitha");
		for(String name1:name) {
		System.out.println(name1);
		}
	}
}
