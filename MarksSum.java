class Student1 {
    String rollNumber, name, gender;
    int age, passOutYear;
    double cgpa;
    void setAllValues(String roll, String n,String g,int a,int p,double c){
        rollNumber = roll;
        name = n;
        gender = g;
        age = a;
        passOutYear = p;
        cgpa = c;
    }
    void printStudentDetails(){
        System.out.println("Roll Number:"+rollNumber);
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Pass out year:"+passOutYear);
        System.out.println("CGPA:"+cgpa);
    }
}
class MarksSum {
    public static void main(String[] args){
        Student1 s1 = new Student1();
        s1.setAllValues("23p31a1222", "satya", "female", 20, 2027, 82.3);
        s1.printStudentDetails();

        Student1 s2 = new Student1();
        s2.setAllValues("23p31a1220", "little monster", "female", 20, 2027, 87.5);
        s2.printStudentDetails();
    }
}