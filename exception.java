import java.util.Scanner;
class TooYoungException extends RuntimeException {
    public TooYoungException() {
        super();
    };
    public TooYoungException(String msg) {
        super(msg);
    }
}

class TooOldException extends RuntimeException {
    public TooOldException() {
        super();
    }
    public TooOldException(String msg) {
        super(msg);
    }
}

public class exception {
    public static void checkEligibility(int age) throws TooYoungException {
        if(age < 21) {
            throw new TooYoungException("you are too young your  life ruined");
        }
        else {
            System.out.println("RIP");
        } 
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age = read.nextInt();
        try {
            checkEligibility(age);
        }
        catch (TooYoungException e) {
            System.out.println(e.getMessage());
        }
        catch(TooOldException e) {
            System.out.println(e);
        }
    }
}
