package mypackage;
import java.util.Scanner;
class PinMissmatchException extends Exception{
     PinMissmatchException(String msg){
		super(msg);
	}
	
}
public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int correctPin = 1234;

        try {
            for (int i = 1; i <= 3; i++) {
            	{  System.out.print("Enter PIN: ");}
                int pin = sc.nextInt();

                if (pin == correctPin) {
                    System.out.println("Welcome " + name);
                    return;
                }

                if (i == 3)
                {  throw new PinMissmatchException(
                        "Sorry..Your Account Has been Locked");}
                
                System.out.println("Wrong PIN");
            }
        } catch (PinMissmatchException e) {
            System.out.println(e.getMessage());
        }
        }
	}

	 


