package package1;
public class cat {
    public String name; 
    public int age;
    public cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.println("Name is:" + name);
        System.out.println("Age is:" + age);
    }  
}