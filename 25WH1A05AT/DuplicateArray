import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");
        int count=0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    count++;
                    break;
                }
            }
        }
        System.out.println("no of duplicate elements " + count);
    }
}
