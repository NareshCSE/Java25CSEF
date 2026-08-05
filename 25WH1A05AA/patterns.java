package mypackage0aa;

public class patterns {

    public static void main(String[] args) {
        
        // --- Pattern A ---
        System.out.println("Pattern A:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n---------------------\n");

        // --- Pattern B ---
        System.out.println("Pattern B:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n---------------------\n");

        // --- Pattern C ---
        System.out.println("Pattern C:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n---------------------\n");

        // --- Pattern D ---
        System.out.println("Pattern D:");
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print((char)('A' + k) + " ");
            }
            System.out.println();
        }

        System.out.println("\n---------------------\n");

        // --- Pattern E ---
        System.out.println("Pattern E:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
}