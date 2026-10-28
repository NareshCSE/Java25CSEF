package myproject5at;

import java.util.Arrays;
import java.util.List;

public class StreamAPI{
    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1,37,85,23,32,86,90,65,47);

        // Filter and display even numbers using Stream API
        System.out.println("Even numbers are:");

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}

