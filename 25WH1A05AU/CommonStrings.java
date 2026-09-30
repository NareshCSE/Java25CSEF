 import java.util.Scanner;

public class CommonStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a[] = new String[5];
        String b[] = new String[5];

        System.out.println("Enter first array strings:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.next();

        System.out.println("Enter second array strings:");
        for (int i = 0; i < 5; i++)
            b[i] = sc.next();

        System.out.println("Common Elements:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i].equals(b[j])) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
