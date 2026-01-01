class teacher {
    static int numberOfInstances;
    String name;
    int age;
    public teacher(String name, int age){
        this.name = name;
        this.age = age;
        numberOfInstances++;
    }
    static void printCurrentInstances(){
        System.out.println(numberOfInstances);
    }
public class StaticFun {
   public static void main(String[] args) {
    teacher te1 = new teacher("satya", 12);
    teacher te2 = new teacher("varsha", 20);
    teacher.printCurrentInstances();
   } 
  }
}