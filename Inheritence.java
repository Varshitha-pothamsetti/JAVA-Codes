class person {
    String name;
    int age;
    void introduce() {
        System.out.println("Hi, I Am " + name + ", " + age + "years old.");
    }
}
class student4 extends person {

}
class Trainer extends person{

}
public class Inheritence {
    public static void main(String[] args) {
        student4 s1 = new student4();
        Trainer t1 = new Trainer();
        person p1 = new person();
        s1.name = "SATYA";
        s1.age = 17;
        s1.introduce();
        System.out.println(p1 instanceof person);
        System.out.println(s1 instanceof person);
        System.out.println(t1 instanceof person);

    }   
}
