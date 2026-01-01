import java.util.Scanner;
import javax.swing.JOptionPane;
class MyMath {
    public void divide(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
}
public class getConnection1 {
    public static void main(String[] args) {
        MyMath u1 = new MyMath();
        try{
            u1.divide(10, 0);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        MyMath u2 = new MyMath();
        try {
            u2.divide(100, 0);
        }
        catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
