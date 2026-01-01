import java.util.Scanner;
class Cat{
    String name ;
    public cat() {}
    public cat(String name) {this.name = name;}
}
public class CAT2 {
    public static void main(String[] args) {
        Cat c1 = new cat();
        try {
            System.out.println(c1.name.toupperCase());
        }
        catch(NullPointersException e){
            System.out.println(e.getMessage());
        }
    }
}
