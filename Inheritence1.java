class Person {
    String name;
    int age;
}
class Student extends Person {
    String id;
    String branch;
    String college;
}
class Intern extends Student {
    String internId;
    double salary;
}
public class Inheritence1 {
    public static void main(String[] args) {
        Intern i1 = new Intern();
        i1.name = "satya";
        System.out .println(i1.name);
    }   
}
