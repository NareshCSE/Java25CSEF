package oopj_05aa;

import java.util.Arrays;
import java.util.List;

public class UppercaseNames {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("alice", "bob", "charlie", "david");

        System.out.println("Uppercase Names:");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}