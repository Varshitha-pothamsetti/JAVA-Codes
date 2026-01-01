
class Student {
    String name, branch;
    int id;
    Student(String name, String branch, int id){
        this.name = name;
        this.branch = branch;
        this.id = id;
    }
    void printDetails() {
        System.out.println("NAME: " + name + "\nBRANCH: " +branch + "\nID: " + id);
    }
} 
class ExampleTHIS {
    public static void main(String[] args){
        Student s1 = new Student("SATYA", "IT", 122);
        s1.printDetails();
    }
}
