package myproject5at;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> map= new HashMap<>();
		System.out.println("Enter a paragraph");
		String paragraph=sc.nextLine().toLowerCase();
		String[] words=paragraph.split("\\s+");
		
		for(String word : words) {
			map.put(word, map.getOrDefault(word,0)+1);
		}
		System.out.println("Word Frequencies:");
		
		for(String word : map.keySet()) {
			System.out.println(word + " : " + map.get(word));
		}
		sc.close();
	}

}
