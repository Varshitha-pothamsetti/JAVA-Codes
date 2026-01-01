class Employee1{
    String name;
    int id;
    double salary;
    public Employee1(String name, int id, double salary){
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
class EmployeeDetails{
    public static void main(String[] args) {
        Employee1[] employees={new Employee1("satya", 1, 50000),
                              new Employee1("bhavya", 2, 60000),
                              new Employee1("varsha", 3, 70000) };
        for(int i=0;i<employees.length;i++){
            employees[i].printDetails();
        }
    }
}
