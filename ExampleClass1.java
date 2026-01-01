class Student {
    String name;
    int age;  
    // instance method
    void printDetails(){
        System.out.println(name + " " +age);
    }
}
class ExampleClass1{
    public static void main(String[] args){
        // object of the class
        // classname object_name = new Classmate()
        Student s1 = new Student(); //s1 is the object of student class
        // Accessing the members of the class through object
        s1.name = "satya";
        s1.age = 20;
        s1.printDetails(); //System.out.println(s1.name + " "+s1.age);
        Student s2 = new Student();
        s2.name = "varshitha";
        s2.age = 22;
        s2.printDetails(); //System.out.println(s2.name + " "+s2.age);
    }
}
