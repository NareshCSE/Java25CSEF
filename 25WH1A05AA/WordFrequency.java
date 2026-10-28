package oopj_05aa;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String text = sc.nextLine().toLowerCase();

        String[] words = text.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word Frequencies:");
        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }

        sc.close();
    }
}