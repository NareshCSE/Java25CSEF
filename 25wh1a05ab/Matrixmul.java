package javaprograms;
import java.util.Scanner;

public class Matrixmul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int columns1 = scanner.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int columns2 = scanner.nextInt();

        // Check multiplication condition
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            scanner.close();
            return;
        }

        int[][] firstMatrix = new int[rows1][columns1];
        int[][] secondMatrix = new int[rows2][columns2];
        int[][] result = new int[rows1][columns2];

        System.out.println("Enter first matrix:");
        for (int row = 0; row < rows1; row++) {
            for (int column = 0; column < columns1; column++) {
                firstMatrix[row][column] = scanner.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int row = 0; row < rows2; row++) {
            for (int column = 0; column < columns2; column++) {
                secondMatrix[row][column] = scanner.nextInt();
            }
        }

        // Matrix multiplication logic
        for (int row = 0; row < rows1; row++) {
            for (int column = 0; column < columns2; column++) {
                for (int index = 0; index < columns1; index++) {
                    result[row][column] += firstMatrix[row][index] * secondMatrix[index][column];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int row = 0; row < rows1; row++) {
            for (int column = 0; column < columns2; column++) {
                System.out.print(result[row][column] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
