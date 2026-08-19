package myproject25wh1a05aa;

public class array {

    public static void main(String[] args) {
        System.out.println("--- a) Duplicate Integers ---");
        int[] numbers = {1, 4, 3, 2, 5, 4, 3, 7, 8, 1};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }

        System.out.println("\n--- b) Matrix Multiplication ---");
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--- c) Common String Elements ---");
        String[] array1 = {"Apple", "Banana", "Orange", "Grapes"};
        String[] array2 = {"Mango", "Banana", "Grapes", "Pineapple"};

        System.out.println("Common elements:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
    }

}