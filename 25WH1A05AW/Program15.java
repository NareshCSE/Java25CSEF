package mypackage5aw;
import java.util.Scanner;
class PinMismatchException extends RuntimeException {
    PinMismatchException(String msg) {
        super(msg);
    }
}
public class Program15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        int correctPin = 3210;
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter PIN: ");
                int pin = scanner.nextInt();
                if (pin == correctPin) {
                    System.out.println("Welcome " + name);
                    return;
                }
                if (i == 3)
                    throw new PinMismatchException(
                    "Sorry,Your Account Has been Blocked");
                System.out.println("Wrong PIN");
            }
        } catch (PinMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}




