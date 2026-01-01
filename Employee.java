public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void printDetails(){
        System.out.println("Name is: " + name);
        System.out.println("Is is :" + id);
        System.out.println("Salary is :" + salary);
    }
}
public class Main{
    public static void main(String[] args) {
        Employee[] employees = {new Employee("VARSHA", 1, 50000),
                                new Employee("SATYA", 122, 200000),
                                new Employee("BHAVYA", 120, 30000)};
        for(int i = 0; i < employees.length; i++){
            employees[i].printDetails();
        }
    }
}