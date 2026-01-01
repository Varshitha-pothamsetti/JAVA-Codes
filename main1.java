class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}

public class main {
    public static void main(String[] args){
        Person person1 = new Person("satya", 20);
        person1.displayInfo()
    }
}
