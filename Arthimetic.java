import java.util.Scanner;
class Arthimetic {
    public static void  main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        try {
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("You cannot divide by 0");
        }
        System.out.println("I will be printed on the screen");
    }
}
