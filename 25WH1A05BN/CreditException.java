package myproject;

class CreditsNotSufficientException extends Exception {

    CreditsNotSufficientException(String message) {
        super(message);
    }
}

class CreditChecker {

    void checkCredits(int credits)
            throws CreditsNotSufficientException {

        if (credits < 50) {
            throw new CreditsNotSufficientException(
                "Credits are less than 50"
            );
        }

        System.out.println("Credits are sufficient");
    }

    void method1(int credits) {

        try {
            checkCredits(credits);
        } catch (CreditsNotSufficientException e) {
            System.out.println(e.getMessage());
        }
    }

    void method2(int credits) {

        try {
            checkCredits(credits);
        } catch (CreditsNotSufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class CreditExceptionDemo {

    public static void main(String[] args) {

        CreditChecker c = new CreditChecker();

        c.method1(40);
        c.method2(70);
    }
}
