package mypackage5aw;
class CreditsNotSufficientException extends Exception{
    CreditsNotSufficientException(String msg){
        super(msg);
    }
}
public class Program14{
    static void checkCredits(int credits) throws CreditsNotSufficientException{
        if(credits < 50)
            throw new CreditsNotSufficientException("Credits are less than 50");
        else
            System.out.println("Credits are sufficient");
    }
    static void caller1(){
        try{
            checkCredits(23);
        } catch(CreditsNotSufficientException e){
            System.out.println(e.getMessage());
        }
    }
    static void caller2(){
        try{
            checkCredits(790);
        }catch(CreditsNotSufficientException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        caller1();
        caller2();
    }
}
