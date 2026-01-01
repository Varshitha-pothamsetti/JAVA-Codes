class cat{
    String name;
    int age;
}
public class ObjectClass {
    public static void main(String[] args) {
        cat c1 = new cat();
        System.out.println(c1 instanceof cat);
        System.out.println(c1 instanceof Object);
    }
}
