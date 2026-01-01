class DateOfBirth {
    int day, month, year;
    DateOfBirth(int day, int month,int year){
    this.day = day;
    this.month = month;
    this.year = year;
}
public String toString() {
    return day + "-" + month + "-" + year;
  }
}
class Student2 {
    String name, branch;
    int age;
    DateOfBirth dob;

    //constructor
    Student2(String branch, String name, DateOfBirth dob) {
        this.branch = branch;
        this.name = name;
        this.dob = dob;
    }
    void calculateAndPrintAge() {
        System.out.println(name + branch);
        System.out.println(2024 - dob.year);
    }
}
public class BirthExample {
    public static void main(String[] args) {
        Student2 s1 = new Student2("IT", "SATYA",new DateOfBirth(8, 2, 2004));
        System.out.println("Date of Birth: " + s1.dob);
        s1.calculateAndPrintAge();
    }
}
