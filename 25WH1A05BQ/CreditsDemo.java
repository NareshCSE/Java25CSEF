package mypackage5bq;

import java.util.Scanner;

class CreditsNotSufficientException extends Exception {
    CreditsNotSufficientException(String msg) {
        super(msg);
    }
}

class CreditChecker {

    void checkCredits(int credits)
            throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException(
                "Credits are less than 50. Not sufficient!"
            );
        } else {
            System.out.println("Sufficient credits: " + credits);
        }
    }

    void callerMethod1(int credits) {
        try {
            checkCredits(credits);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Caller Method 1: " + e.getMessage());
        }
    }

    void callerMethod2(int credits) {
        try {
            checkCredits(credits);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Caller Method 2: " + e.getMessage());
        }
    }
}

public class CreditsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditChecker obj = new CreditChecker();

        System.out.print("Enter credits for Caller Method 1: ");
        int c1 = sc.nextInt();
        obj.callerMethod1(c1);

        System.out.print("Enter credits for Caller Method 2: ");
        int c2 = sc.nextInt();
        obj.callerMethod2(c2);

        sc.close();
    }
}

